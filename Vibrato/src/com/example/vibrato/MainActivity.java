package com.example.vibrato;

import java.util.ArrayList;
import com.google.common.primitives.Longs;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.Vibrator;
import android.text.Editable;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {
	private Context context = this;
	private EditText inputText;
	final long letterDelay = 1000;
	final long interDelay = 300;
	final long shortVibe = 200;
	final long longVibe = 500;
	final long space = 2000;
	
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        context = this;
        
        inputText = (EditText)findViewById(R.id.input);
        System.out.println(inputText.getText());          
        final MorseMap morseMap = new MorseMap();
        
        Button submitButton = (Button)findViewById(R.id.vibrate);
        
        submitButton.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(context, inputText.toString(), Toast.LENGTH_SHORT).show();
				Vibrator vibrator = (Vibrator) getSystemService(Context.VIBRATOR_SERVICE);	
				Editable s = inputText.getText();
				ArrayList<Long> vibes = new ArrayList<Long>();
				vibes.add(0l);
				for(int i = 0; i< s.length(); i++){	
					char x = s.charAt(i);
					System.out.println(x);
					if(Character.isLetter(x)){
						x = Character.toUpperCase(x);
					}
					if(x == ' '){						
						vibes.set(vibes.size()-1,space);
						continue;
					}
					boolean[] moses = morseMap.hMorseMap.get(x);
					for(int j=0; j<moses.length; j++){
						if(moses[j]){
							vibes.add(longVibe);
						}
						else{
							vibes.add(shortVibe);
						}
						vibes.add(interDelay);
					}
					vibes.set(vibes.size()-1,letterDelay);					
				}
				
				System.out.println(vibes);
				vibrator.vibrate(Longs.toArray(vibes), -1);
				//vibrator.vibrate(new long[]{0, 500, 100, 1000, 1000, 1000, 100, 500}, -1);
			}
		});
        
        
        
        
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}

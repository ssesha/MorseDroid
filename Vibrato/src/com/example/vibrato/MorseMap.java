package com.example.vibrato;

import java.util.HashMap;

public class MorseMap {
	public HashMap<Character, boolean[]> hMorseMap = new HashMap<Character, boolean[]>();
	
	public MorseMap(){
		//- is true . is false
		
		hMorseMap.put('A', new boolean[]{false,true});
		hMorseMap.put('B', new boolean[]{true,false,false,false});
		hMorseMap.put('C', new boolean[]{true,false,true,false});
		hMorseMap.put('D', new boolean[]{true,false,false});
		hMorseMap.put('E', new boolean[]{false});
		hMorseMap.put('F', new boolean[]{false,false,true,false});
		hMorseMap.put('G', new boolean[]{true,true,false});
		hMorseMap.put('H', new boolean[]{false,false,false,false});
		hMorseMap.put('I', new boolean[]{false,false});
		hMorseMap.put('J', new boolean[]{false,true,true,true});
		hMorseMap.put('K', new boolean[]{true,false,true});
		hMorseMap.put('L', new boolean[]{false,true,false,false});
		hMorseMap.put('M', new boolean[]{true,true});
		hMorseMap.put('N', new boolean[]{true,false});
		hMorseMap.put('O', new boolean[]{true,true,true});
		hMorseMap.put('P', new boolean[]{false,true,true,false});
		hMorseMap.put('Q', new boolean[]{true,true,false,true});
		hMorseMap.put('R', new boolean[]{false,true,false});
		hMorseMap.put('S', new boolean[]{false,false,false});
		hMorseMap.put('T', new boolean[]{true});
		hMorseMap.put('U', new boolean[]{false,false,true});
		hMorseMap.put('V', new boolean[]{false,false,false,true});
		hMorseMap.put('W', new boolean[]{false,true,true});
		hMorseMap.put('X', new boolean[]{true,false,false,true});
		hMorseMap.put('Y', new boolean[]{true,false,true,true});
		hMorseMap.put('Z', new boolean[]{true,true,false,false});
		hMorseMap.put('1', new boolean[]{false,true,true,true,true});
		hMorseMap.put('2', new boolean[]{false,false,true,true,true});
		hMorseMap.put('3', new boolean[]{false,false,false,true,true});
		hMorseMap.put('4', new boolean[]{false,false,false,false,true});
		hMorseMap.put('5', new boolean[]{false,false,false,false,false});
		hMorseMap.put('6', new boolean[]{true,false,false,false,false});
		hMorseMap.put('7', new boolean[]{true,true,false,false,false});
		hMorseMap.put('8', new boolean[]{true,true,true,false,false});
		hMorseMap.put('9', new boolean[]{true,true,true,true,false});
		hMorseMap.put('0', new boolean[]{true,true,true,true,true});
		hMorseMap.put('.', new boolean[]{false,true,false,true,false,true});
		hMorseMap.put(',', new boolean[]{true,true,false,false,true,true});
		hMorseMap.put(':', new boolean[]{true,true,true,false,false,false});
		hMorseMap.put('?', new boolean[]{false,false,true,true,false,false});
		hMorseMap.put('\'', new boolean[]{false,true,true,true,true,false});
		hMorseMap.put('-', new boolean[]{true,false,false,false,false,true});
		hMorseMap.put('/', new boolean[]{true,false,false,true,false});
		hMorseMap.put('(', new boolean[]{true,false,true,true,false,true});
		hMorseMap.put(')', new boolean[]{true,false,true,true,false,true});
		hMorseMap.put('"', new boolean[]{false,true,false,false,true,false});
		hMorseMap.put('@', new boolean[]{false,true,true,false,true,false});
		hMorseMap.put('=', new boolean[]{true,false,false,false,true});
	}
	

}

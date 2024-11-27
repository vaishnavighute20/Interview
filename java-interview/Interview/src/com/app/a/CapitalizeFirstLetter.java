package com.app.a;

public class CapitalizeFirstLetter {

	public static String capitalizeWords(String enterinput) {
		String[] str= enterinput.split(" ");// space is imp
        StringBuilder result=new StringBuilder();
        
        for(String word: str) {
        	result.append(Character.toUpperCase(word.charAt(0)))
        	.append(word.substring(1).toLowerCase())
        	.append(" ");
        }
		
		return result.toString().trim();
		
	}
	
	public static void main(String[] args) {
 
		String enterinput ="hello world from java ";
		System.out.println("Capitalized String= "+ capitalizeWords(enterinput));
	}

}

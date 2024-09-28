package com.app.string;

public class RemoveVowelsFromString {

	public static void main(String[] args) {
		String str1="VaIshnavI";
		String str2="";
		str2=str1.replaceAll("[aeiouAEIOU]", "");
		System.out.println("String after removing vowels  : "+ str2);
		
 
	}

}

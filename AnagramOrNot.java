package com.app.string;

import java.util.Arrays;

public class AnagramOrNot {

//	 two strings elbow and below
//	 Both the strings have same length, same letters
	public static void main(String[] args) {

		String a="elBow";
		String b="beloW";
		char []c=a.toLowerCase().toCharArray();
		char[]d=b.toLowerCase().toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c, d))
		{
			System.out.println("anagram");
		}
		else
		{
			System.out.println("Non anagram");
		}

		
	}

}

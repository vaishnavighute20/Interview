package com.app.string;

import java.util.Scanner;

public class VowelOrconsonanr {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a charavter : ");
		char c=sc.next().charAt(0);
		// checking for vowels
		if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'||c=='A'||c=='E'||c=='I'||c=='O'||c=='U')
		{
			System.out.println("the char is vowel");
		}
		else
		{
			System.out.println("char is consonant");
		}
 	}                                    

}

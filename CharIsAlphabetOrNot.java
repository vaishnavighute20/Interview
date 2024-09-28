package com.app.string;

import java.util.Scanner;

public class CharIsAlphabetOrNot {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a char : ");
		char ch =sc.next().charAt(0);
		if((ch>='a'&&ch<='z')||(ch>='A'&&ch<='Z'))
			{
				System.out.println("it is character");	
			}
		else
		{
			System.out.println("not a character");
		}
		
	}

}

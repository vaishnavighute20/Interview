package com.app.string;

import java.util.Scanner;

public class AsciiValue {

	public static void main(String[] args) {
 
		
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a char : ");
		char ch=sc.next().charAt(0);
		int i=ch;
		System.out.println("asccii value : "+i);
		
	}

}
 
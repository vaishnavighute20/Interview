package com.app.a;

import java.util.Scanner;

public class AsterickMover {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("enter a word :");
		String str=sc.nextLine();
		
		StringBuilder letter = new StringBuilder();
        StringBuilder asterik = new StringBuilder();
        
        for(int i=0;i<str.length();i++) {
        	char ch=str.charAt(i);
        	if(ch=='*') {
        		asterik.append(ch);
        	}
        	else {
        		letter.append(ch);
        	}
        }
      
        System.out.println("Output: " + letter.toString()+asterik.toString()  );
	}

}

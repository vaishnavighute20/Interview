package com.app.string;

import java.util.Scanner;

public class CapitalizeFirstAndLastChar {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter a String : ");
		String s=sc.nextLine();
		String newstr="";
	      // splitting sentence into word converted to String array
		String[] str = s.split("\\s");  
		for (String strg :str)
		{
			int length=strg.length();
			String firstchar=strg.substring(0, 1).toUpperCase();
		    String restchar = strg.substring(1, length - 1);
		    String lastchar= strg.substring( length-1).toUpperCase();
		    newstr=newstr+firstchar+restchar+lastchar;
		    

		}
		
		System.out.println(newstr);
	}

}

package com.app.a;

import java.util.Scanner;

public class Charcount {

	  public static void main(String[] args) {
           Scanner sc=new Scanner (System.in);
           System.out.println("enter a string");
		   String str =  sc.nextLine();
	       int[] count = new int[256];  // Array to store character count (ASCII range)

	        // Count occurrences of each character
	        for (int i = 0; i < str.length(); i++) {
	            char ch = str.charAt(i);
	           if (ch != ' ')// Skip spaces
	            {  
	                count[ch]++;
	            }
	        }

	        // Print the count of characters
	        for (int i = 0; i < 256; i++) {
	            if (count[i] > 0) {
	                System.out.println((char)i + "->" + count[i]);
	            }
	        }
	}

}

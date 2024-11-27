package com.app.a;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class vowelconsonentcount {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Word");
	     String word=sc.nextLine().toLowerCase();
	     
	     // if want to print 
	       List<Character> vowels = new ArrayList<>();
	       List<Character> consonants = new ArrayList<>();
	     int vcount=0;
	     int concount=0;
	     for(int i=0;i<word.length();i++)
	     {
	    	 char ch=word.charAt(i);
	    	 if(ch>='a'&& ch<='z') {
	    		 if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
	    			 vcount++;
	    			 vowels.add(ch);
	    			 
	    		 }
	    		 else
	    		 {
	    			 concount++;
	    			 consonants.add(ch);
	    		 }
	    	 }
	     }
	     
	        System.out.println("Vowels: " + vcount+" "+vowels);
	        System.out.println("Consonants: " + concount+" "+consonants);
	}

}

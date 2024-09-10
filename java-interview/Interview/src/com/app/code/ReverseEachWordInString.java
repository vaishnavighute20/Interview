package com.app.code;

public class ReverseEachWordInString {

	public static void main(String[] args) {
 // Approach 1
	 /*  String str="Welcome to java";//original String
       String[] words=str.split(" ");// Splitting String into words
       String reverseString="";
       for(String w:words)//java
       {
    	   String reverseword="";
    	   for(int i=w.length()-1;i>=0;i--)
    	   {
    		   reverseword=reverseword+w.charAt(i);
    		   
    	   }
    	   reverseString=reverseString+reverseword+" ";//emoclew
       }
       System.out.println(reverseString);
    */    
		
		// Approach2
		String str="Welcome to java";//original String
	       String[] words=str.split("\\s ");// Splitting String into words
    	   String reverseword="";
            for(String w:words)//java
	       {
            	StringBuilder sb=new StringBuilder(w);
            	sb.reverse();
            	reverseword=reverseword+sb.toString()+"";
            	
	       }
        	System.out.println(reverseword);

	}

}

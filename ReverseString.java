package com.app.string;

public class ReverseString {

	public static void main(String[] args) {

		String s="Iacsd dac";
	
		
	/*
		StringBuilder sb=new StringBuilder();
		sb.append(s);
		System.out.println( "String is : "+sb);
	    sb.reverse();
	    System.out.println("Reversed string is : "+sb);
	*/
		
		
		 String rev = "";

		    for (int i = s.length()-1; i >=0; i--) {
		      rev=rev+s.charAt(i);
		    }
		    System.out.println(rev);

	}

}

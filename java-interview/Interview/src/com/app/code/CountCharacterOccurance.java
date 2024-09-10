package com.app.code;

public class CountCharacterOccurance {

	public static void main(String[] args) {
       String s="java programming and java oops";
       int total_count=s.length();// total length of string
       int total_count_after_remove =s.replace("j","").length();//total length after removing a
       int count=total_count - total_count_after_remove;
       System.out.println("Number of ocuurance of j is : "+count);
       
       
	}

}

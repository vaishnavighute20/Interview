package com.app.string;

public class RemoveCharExceptAlphabet {

	public static void main(String[] args) {
 
		String s="hel@lo*123vaish";
		s=s.replaceAll("[^a-zA-Z]", "");
		System.out.println(s);
		
	}

}

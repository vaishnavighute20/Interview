package com.app.code;

public class RemoveJunk {

	public static void main(String[] args) {
 
		String s ="a/+_-@!#$%bjnbjn*@# String 012345678";
	    String s1="@@#$%&^*!~_+fghjhgfgjbfghJ!!1233{}||:";
		s=s.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s);
		
		s1=s1.replaceAll("[^a-zA-Z0-9]","");
		System.out.println(s1);

		
	}

}

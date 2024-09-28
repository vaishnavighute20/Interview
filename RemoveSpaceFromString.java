package com.app.string;

public class RemoveSpaceFromString {

	public static void main(String[] args) {
 
		StringBuffer sb=new StringBuffer();
		String s="I Am Developer";
		String []s1=s.split("[\s]");
		for (String string : s1) {
			sb.append(string);
		}
	    System.out.println(sb);
	}

}

package com.app.string;

public class RemoveBrackets {

	public static void main(String[] args) {
 
		String s= "(a+b)*(a-b)={c}";
		String result =s.replaceAll( "[(){}]","");
		System.out.println("Expression without brackets : "+result);
	}

}

package com.app.string;

public class ReplaceWordbyAnotherWord {

	public static void main(String[] args) {
		
		String str="Hi I my Vaishnavi";
		String wordToReplace="my";
        str = str.replaceAll("my", "am");
		
		 // Trim the string using trim() method
        str = str.trim();
		System.out.println(str);
         
	}

}

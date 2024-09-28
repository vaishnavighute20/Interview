package com.app.string;

public class lengthOfStringWithoutFunction {
	
	public static void main(String[]args)
	{
		 int length=0;
		 String str="Vaishnavi";
		 for(char ch : str.toCharArray())
			 length++;
		 System.out.println("Length of String is : " +length);
	}

}

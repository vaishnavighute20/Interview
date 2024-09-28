package com.app.string;

public class ToggleEachChar {

	public static void main(String[] args) {
 
		String str1="VaishnaVi";
		String str2="";
		for(int i=0;i<str1.length();i++)
		{
			if(Character.isUpperCase(str1.charAt(i)))
				str2=str2+Character.toLowerCase(str1.charAt(i));
			else
		      str2=str2+Character.toUpperCase(str1.charAt(i));

		}
		System.out.println("Toggle String is : "+str2);
		
	}

}

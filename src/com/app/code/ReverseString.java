package com.app.code;

public class ReverseString {

	public static void main(String[] args) {
 
		// 1 using + (String concatenation )operator
		String str ="ABCD";
		String rev="";
	/* 	int length=str.length();
		System.out.println(length);//4
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+str.charAt(i);	
		}
		System.out.println("reverse String is :"+rev);
	*/
		
		// 2 using character array
	/*	char a[]=str.toCharArray();
		int length=a.length;
		for(int i=length-1;i>=0;i--)
		{
			rev=rev+a[i];
		}
		System.out.println("reverse String is :"+rev);
*/
		//3  using StringBuffer class
		StringBuffer sb =new StringBuffer(str);
		System.out.println(sb.reverse());
	}

}
 
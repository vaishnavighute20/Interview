package com.app.code;

import java.util.Scanner;

public class ReverseNumber {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number : ");
		int num=sc.nextInt();//1234
		// 1 using algorithm
	/*	int rev=0;
		while (num!=0)
		{
			rev=rev*10 + num%10; // give last digit
			num=num/10;// last digit is excluded due to /
			
		}	
			System.out.println("Reverse number is :"+ rev);

		*/
		//2  using Stringbuffer class 
	/*
		StringBuffer sb =new StringBuffer(String.valueOf(num));
		StringBuffer rev=sb.reverse();
		
		System.out.println("Reverse number is :"+ rev);
	*/
		
		// using StringBuilder class
		
		StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev =sb1.reverse();
		System.out.println("Reverse number is :"+ rev);

	}

}

package com.app.code;

import java.util.Scanner;

public class LargestOfThreeNumber {

	public static void main(String[] args) {
      Scanner sc= new Scanner(System.in);
      System.out.println("Enter First Number");
      int a=sc.nextInt();
      System.out.println("Enter Second Number");
      int b=sc.nextInt();
      System.out.println("Enter Third Number");
      int c=sc.nextInt();
      // Approch 1
   /*   if(a>b&&a>c)
      {
    	 System.out.println(a+" : is a largest number");
      }
      else if(b>a &&b>c)
      {
     	 System.out.println(b+" : is a largest number");

      }
      else if(c>a &&c>b)
      {
     	 System.out.println(c+" : is a largest number");

      }
      */
      // Approach2  Ternary Operator
   //  int largest1= a>b?a:b;// largest of a and b
  //  int largest2=c>largest1?c:largest1;
    int largest=c>(a>b?a:b)?c:(a>b?a:b);

	 System.out.println(largest+" : is a largest number");

	}

}

//a>b and a>c   a is largest
//b>a and b>c   b is largest
//c>a and c>b   c is largest
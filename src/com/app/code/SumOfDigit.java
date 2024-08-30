package com.app.code;

public class SumOfDigit {

	public static void main(String[] args) {
     int num=12345;
     int sum=0;
     while(num>0)
     {
    	 sum=sum+num%10;//5 4 3
    	 num=num/10;//1234 123 
     }
     System.out.println("sum of digit in a number : "+sum);
	}

}

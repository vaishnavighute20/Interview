package com.app.code;

public class CountNOEvenOrOdd {

	public static void main(String[] args) {
		int num=2081998;
		int evencount=0;
		int oddcount=0;
		
		while(num>0)
		{
			int rem = num%10;
		    if(rem%2==0)
		    {
		    	evencount++;
		    	
		    }else
		    {
		    	oddcount++;
		    }
		    num=num/10;
		}
            System.out.println("Number of even numbers: "+evencount);
            System.out.println("Number of odd numbers: "+oddcount);

	}

}

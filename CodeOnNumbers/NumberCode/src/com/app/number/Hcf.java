package com.app.number;

import java.util.Scanner;

public class Hcf {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int hcf=0;
	
  /*
		for(int i=1;i<=num1||i<=num2;i++)
		{
			if(num1 %i==0&&num2%i==0)
				hcf=i;
			
		}
		
		System.out.println("hcf is : "+hcf);
		
	*/
		
		// using subtraction method
		  while (num1 != num2)
		    {
		        if (num1 > num2)
		            num1 -= num2;
		        else
		            num2 -= num1;
		    }


		    System.out.println("The HCF: "+ num1);
	}

}

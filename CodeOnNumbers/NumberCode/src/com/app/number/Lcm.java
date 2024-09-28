package com.app.number;

import java.util.Scanner;

public class Lcm {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter numbers");
		int num1=sc.nextInt();
		int num2=sc.nextInt();
		int hcf=1;
		// calculating hcf
		for(int i=1;i<=num1||i<=num2;i++)
		{
			if (num1%i==0&&num2%i==0)
				hcf=i;
		}
		//lcm 
		int lcm=(num1*num2)/hcf;
		System.out.println("lcm is : "+lcm);
	}

}

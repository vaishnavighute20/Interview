package com.app.number;

import java.util.Scanner;

public class MaxHandShake {

	public static void main(String[] args) {
 
		Scanner sc=new Scanner (System.in);
		System.out.println("Enter number");
		int num=sc.nextInt();
		int total=num*(num-1)/2;
		System.out.println("Number of handshake for "+num+" person is : "+total);
	}

}

package com.app.a;

import java.util.Scanner;

public class Febonacci {

	public static void main(String[] args) {
  		      int n1=0,n2=1,sum=0;
 		      System.out.println("without recurssion");
		      System.out.print(n1+" "+n2);
		      for(int i=2;i<10;i++)
		      {
		    	  sum=n1+n2;//0+1 1+1 1+2
		    	  System.out.print(" "+ sum);//1 2 3
		          n1=n2;//1 2
		          n2=sum;//1 2 3
		  
	}
		      System.out.println();
		      System.out.println("with recurssion");

 		      Scanner scanner = new Scanner(System.in);
		        System.out.print("Enter the number of digits: ");
		        int num = scanner.nextInt();

		        System.out.println("Fibonacci Series (Recursive):");
		        for (int i = 0; i < num; i++) {
		            System.out.print(fibonacci(i) + " ");
		        }
		    }

		    public static int fibonacci(int n) {
		        if (n <= 1) {
		            return n;
		        }
		        return fibonacci(n - 1) + fibonacci(n - 2);
		    }      
		     	      
}

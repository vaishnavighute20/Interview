package com.app.pattern;

public class ReverseHillPattern {

	public static void main(String[] args) {
 
	/*	int n=5;
		for(int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}

			for (int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			for (int j=i;j<n;j++)
			{
				System.out.print("*");
			}
			System.out.println();
		}
			*/
		
		
		  int n = 5;
	        for (int i = n; i >= 1; i--) {
	            for (int j = n; j > i; j--) {
	                System.out.print(" ");
	            }
	            for (int k = 1; k <= (2 * i - 1); k++) {
	                System.out.print("*");
	            }
	            System.out.println();
	        }
	}
}



/*
incresing space 
decreasing star
decreasing star
 *********
  *******
   *****
    ***
     *

*/
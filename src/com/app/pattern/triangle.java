package com.app.pattern;

public class triangle {

	public static void main(String[] args) {
 
	/*	int n=5;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=i;j++)// same as square only change j<=i
				// As we want to print number of * as number of row
			{
				System.out.print("* ");
			}
			System.out.println();

		}
		
		*/
	
		
		int n=5;
		for (int i=1;i<=n;i++)
		{
			for (int j=i;j<=n;j++)// same as square only change j=i
				// As we want to print number of * as number of row
			{
				System.out.print("* ");
			}
			System.out.println();

		}
		
		/*
		
	
* * * * * 
* * * * 
* * * 
* * 
* 
		 
		 */
	}

}

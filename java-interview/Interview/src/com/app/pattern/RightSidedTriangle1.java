package com.app.pattern;

public class RightSidedTriangle1 {

	public static void main(String[] args) {
 // increasing space and decreasing *
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(" ");
			}
			for(int j=i;j<=n;j++)
			{
				System.out.print("*");
			}
			// with outer loop
			System.out.println();
		}
	}
/*
  *****
   ****
    ***
     **
      *

 */
}

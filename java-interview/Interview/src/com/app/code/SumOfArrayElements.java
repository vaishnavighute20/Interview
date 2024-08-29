package com.app.code;

public class SumOfArrayElements {

	public static void main(String[] args) {
		int a[]= {5,2,7,9,6,8};
		int sum=0;
/*		for(int i=0;i<6;i++)
			// if we dont know the size of array then condition is
			// i<=a.length-1
		{
			sum=sum+a[i];
			
		}
	*/	
		// Enhanced for loop
		for (int value:a)
		{
			sum=sum+value;
		}
     System.out.println("sum of array elements : "+sum);
	}

}

package com.app.array;

import java.util.Arrays;

public class HalfAscAndDesc {

	public static void main(String[] args) {
 
		int[] arr= {3,5,66,77,33,55,8,9,11,6,99};
		int n=arr.length;
		printOrder(arr,n);
	}
	
	static void printOrder(int[]arr, int n)
	{
		Arrays.sort(arr);
		// half in ascending
		for(int i=0;i<n/2;i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		// second half in desc
		for (int j=n-1;j>=n/2;j--)
		{
	         System.out.print(arr[j] + " ");
		}
	}

}

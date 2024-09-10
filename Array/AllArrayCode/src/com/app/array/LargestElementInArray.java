package com.app.array;

public class LargestElementInArray {

	public static void main(String[] args) {
		
		int arr[]= {12,13,34,77,10,9,100}; 
		int max=arr[0];
		for(int i=0; i<arr.length;i++)
		{
			if (max<arr[i])  // for smallest only change operator
			{
				max=arr[i];
			}
		}
		System.out.println(max);
	}

}

package com.app.array;

public class SmallestAndLargest {

	public static void main(String[] args) {
 
		int arr[]= {12,33,44,22,99,88,55};
		int largest=arr[0],smallest=arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(smallest>arr[i])
				smallest=arr[i];
			if(largest<arr[i])
				largest=arr[i];
		}
		System.out.println(smallest);
		System.out.println(largest);
	}

}

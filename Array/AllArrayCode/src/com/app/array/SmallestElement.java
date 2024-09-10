package com.app.array;

public class SmallestElement {

	public static void main(String[] args) {
 
		int arr[]= {10,24,2,45,77,1,0,55};
		int min =arr[0];
		for(int i=0;i<arr.length;i++)
		{
			if(min>arr[i])
			{
				min=arr[i];
			}
		}
		System.out.println(min);
	}

}

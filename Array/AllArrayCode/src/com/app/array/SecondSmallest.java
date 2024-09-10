package com.app.array;

public class SecondSmallest {

	static int secSmall(int  arr[],int n)
	{
		int first=Integer.MAX_VALUE, second=Integer.MAX_VALUE;
		for(int i=0;i<n;i++)
		{
			if(arr[i]<first){second=first;first=arr[i];}else if(second>arr[i])
		      second = arr[i];      
		}
		return second;
	}
	
	public static void main(String[] args) {
 
		int arr[]= {12,3,44,55,5,66,99,22,33,44};
		int n=arr.length;
		System.out.println(secSmall(arr,n));
		
	}

}

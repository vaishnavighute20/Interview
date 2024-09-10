package com.app.array;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
 
		int arr[]= {10,22,33,44,33,33,22};
		int n=arr.length;
		Set hs=new HashSet();
		for (int i=0;i<n;i++)
		{
			hs.add(arr[i]);
			System.out.println(hs);
		}
		
	}

}

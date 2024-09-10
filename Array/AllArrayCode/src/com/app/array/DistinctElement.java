package com.app.array;

import java.util.HashMap;
import java.util.Map;

public class DistinctElement {

	public static void main(String[] args) {
 
		int arr[]=new int[] {10,20,10,20,22,33,11};
		int n=arr.length;
		countFreq(arr,n);
	}

	static void countFreq(int arr[],int n)
	{
		Map<Integer, Integer> mp=new HashMap<>();
		int count_dist=0;
		// traverse
		for(int i=0;i<n;i++)
		{
			if(mp.containsKey(arr[i]))
			{
				mp.put(arr[i], mp.get( arr[i]+1));	
			}
			else
			{
				 mp.put(arr[i], 1);
			}
			
		}
	     System.out.println(mp.size());
	     

	     

	}
}

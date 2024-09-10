package com.app.array;

import java.util.HashMap;
import java.util.Map;

public class NonRepeatingElement {

	public static void main(String[] args) {
 
		int arr[]=new int [] {11,22,22,33,44,55,33,44};
		int n=arr.length;
		countFreq(arr,n);
	}
	
	static void countFreq(int arr[],int n)
	{
        // Create a HashMap to store elements and their frequencies
		Map<Integer, Integer> mp=new HashMap<>();
		int count=0;
		
		//Traverse through array elements count frequencies
		for(int i=0;i<n;i++)
		{
			if(mp.containsKey(arr[i]))  //// If the element is already in the map
			{
				mp.put(arr[i], mp.get(arr[i])+1);// Increment its frequency by 1
			}
			else
			{
				 mp.put(arr[i],1);//If the element is not in the map, add it with frequency 1
			}
		}
		// Traverse through map and print frequencies
		for(Map.Entry<Integer, Integer>entry:mp.entrySet())
		{
			if(entry.getValue()==1)//Check if the frequency of the element is 1
				System.out.println(entry.getKey()+" ");
		}
	}

}


 
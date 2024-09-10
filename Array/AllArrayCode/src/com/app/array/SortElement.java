package com.app.array;

public class SortElement {

	public static void main(String[] args) {
 
		int [] arr=new int [] {10,20,55,77,33,22,88};
		int temp=0;
		// Sort array in ascending order
		for(int i=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]>arr[j]) 
				{
					 temp = arr[i]; 
	                 arr[i] = arr[j]; 
	                 arr[j] = temp; 
				}
			}
		}

    //Displaying elements of array after sorting 
	    for (int i = 0; i < arr.length; i++)
	    { 
	     System.out.print(arr[i] + " "); 
	    }
 }
}

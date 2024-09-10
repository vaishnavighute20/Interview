package com.app.array;

import java.util.Arrays;

public class FrequencyOfElement {

	public static void main(String[] args) {
 
		int [] arr= {5,8,5,7,6,6,44,33,44,33,2,2,3,5};
		int size=arr.length;
		countFrequency(arr,size);
	}
	 static void countFrequency(int [] arr,int n)
	 {
		 Arrays.sort(arr);
		 // traverse the sorted array
		 for (int i=0;i<n;i++)
		 {
    			 int count=1;
			 // move index ahead whenever you encounter duplicates
			 while(i<n-1 && arr[i]==arr[i+1])
			 {
				 i++;
				 count++;
				 
			 }
			 System.out.println(arr[i]+ " : "+count);
			 
		 }
		
	 }

}

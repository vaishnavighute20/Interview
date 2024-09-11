package com.app.array;

import java.util.Arrays;
 import java.util.Collections;

public class MinScalarProductOfTwoVectors {

	public static void main(String[] args) {
 
		 Integer arr1[] = {1, 2, 6, 3, 7};
         Integer arr2[] = {10, 7, 45, 3, 7};
         int n = arr1.length;
         // sort arr1 in ascending order
         Arrays.sort(arr1);
         //sort arr2 in descending order
         Arrays.sort(arr2,Collections.reverseOrder());
         int product=0;
         for(int i=0;i<n;i++)
         {
        	 product+=arr1[i]*arr2[i];
             			 
         }
	       System.out.println(product);

	}

}

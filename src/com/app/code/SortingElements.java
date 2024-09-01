package com.app.code;

import java.util.Arrays;
import java.util.Collections;

public class SortingElements {

	public static void main(String[] args) {
 
		//Approach1
		int a[]= {30,50,20,10,60};
		System.out.println("Array elements before sorting : "+Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array elements After sorting : "+Arrays.toString(a));

		// Approach2
		int a1[]= {30,50,20,10,100,40,60};
		System.out.println("Array elements before sorting : "+Arrays.toString(a1));
        Arrays.sort(a1);
		System.out.println("Array elements after sorting : "+Arrays.toString(a1));

		
		// Approach3 reverse desending order
		// not supported for primitive type
		Integer a3[]= {30,50,20,10,100,40,60};
		System.out.println("Array elements before sorting : "+Arrays.toString(a3));
        Arrays.sort(a3,Collections.reverseOrder());
		System.out.println("Array elements after sorting : "+Arrays.toString(a3));

	}

}

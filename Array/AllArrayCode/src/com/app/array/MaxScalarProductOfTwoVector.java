package com.app.array;

import java.util.Arrays;

public class MaxScalarProductOfTwoVector {

	public static void main(String[] args) {
 

        Integer arr1[] = {1, 2, 6, 3, 7};
        Integer arr2[] = {10, 7, 45, 3, 7};
        int n = arr1.length;

        //Sort arr1 in ascending order
        Arrays.sort(arr1);

        //Sort arr2 in ascending order
        Arrays.sort(arr2);

        int product = 0;
        for(int i=0; i<n; i++)
            product += arr1[i]*arr2[i];

        System.out.print(product);
	}

}

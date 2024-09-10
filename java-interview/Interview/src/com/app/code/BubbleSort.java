package com.app.code;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
 
		int a[]= {4,2,1,5,3};
		System.out.println("Array Before Sorting " +Arrays.toString(a));
        int n=a.length;
    	for(int i=0;i<n-1;i++)//number of passes
        {
        		for(int j=0;j<n-1;j++)// iterations
        	{
        		if(a[j]>a[j+1])
        		{
        			int temp=a[j];
        			a[j]=a[j+1];
        			a[j+1]=temp;
        		}
        	}
        }
		System.out.println("Array After Sorting " +Arrays.toString(a));

	}

}

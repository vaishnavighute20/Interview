package com.app.code;

public class MissingNumberInArray {

	//should not have duplicates
	//no need to be sorted order
	// values should be proper range
	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,8};
		//1+2+3+4+5+6+8  sum1
		//1+2+3+4+5+6+7+8  sum2
		//sum2-sum1=missing num
		int sum1=0;
		for(int i=0;i<a.length;i++)
		{
			sum1=sum1+a[i];
		}
		System.out.println("sum of elements in array : "+sum1);
	     int sum2=0;
		for(int i=1;i<=+8;i++)
		{
			sum2=sum2+i;
		}
		System.out.println("sum of elements in range : "+sum2);
	    System.out.println("missing number is : "+(sum2-sum1));
	}

}

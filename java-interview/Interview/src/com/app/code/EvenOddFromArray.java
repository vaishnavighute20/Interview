package com.app.code;

public class EvenOddFromArray {

	public static void main(String[] args) {
 
		int a[]= {1,2,3,4,5,6,7,9,};
		System.out.println("even numbers in array");
		//Extracting even numbers
		for( int i=0;i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.print(a[i]);
		}
		System.out.println();
		System.out.println("odd numbers in array");
		
		for( int i=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.print(+a[i]);
		}
		
		
		//enhanced for loop 
	/*	for(int value:a)
		{
			if(value%2==0)
				System.out.println("even"+value);
		}
		
		for(int value:a)
		{
			if(value%2!=0)
				System.out.println("odd"+value);
		}
		
		*
		*/
	}

}

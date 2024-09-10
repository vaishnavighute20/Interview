package com.app.array;

public class CountNoEvenOdd {

	public static void main(String[] args) {
		int arr []= {11,22,33,44,55,66,77};
		int evenCount=0 ,oddCount=0;
		int n=arr.length;
		
		for(int i=0;i<n;i++)
		{
			if(arr[i]%2==0)
			{
				evenCount++;
			}
			else
			{
				oddCount++;
			}
		}
 
		System.out.println("even count : "+evenCount);
		System.out.println("odd count : "+oddCount);

	}

}

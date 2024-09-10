package com.app.array;

public class DisjointOrNot {

	public static void main(String[] args) {
 
		int arr1[]= {10,51,83,43,6};
		int arr2[]= {80,5,29,3};
		if(Disjoint(arr1,arr2))
			System.out.println("yes");
		else
			System.out.println("no");

	}
	// this function prints all distinct elements
	static boolean Disjoint(int arr1[],int arr2[])
	{
		for(int i=0;i<arr1.length;i++) {
			for(int j=0;j<arr2.length;j++) {
                // If a common element is found, arrays are not disjoint
				if(arr1[i]==arr2[j]) {
					return false;
				}
			}
		}
		return true;
		
	}

}

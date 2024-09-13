package com.app.array;

public class EquilibriumIndex {
	 static int equilibrium_index(int arr[], int n)
	    {
	        int sum = 0;
	        int leftsum = 0;
	        // Calculate total sum of the array
	        for (int i = 0; i < n; ++i)
	            sum += arr[i];

	        for (int i = 0; i < n; ++i) {
	            sum -= arr[i];

	            if (leftsum == sum)
	                return i;

	            leftsum += arr[i];
	        }

	        // If no equilibrium index found
	        return -1;
	    }

	    public static void main(String[] args)
	    {
	        int arr[] = { 1,2,3,4,5,1,3,2,14 };
	        int arr_size = arr.length;
	        System.out.print("Equilibrium Index : ");
	        System.out.println(equilibrium_index(arr, arr_size));
	    }
}


 

 package com.app.array;

public class MaxProductOfSubArray {
	
//Returns the product of max product subarray
    static int maxSubarrayProduct(int arr[])
    {
    	int result=arr[0];
    	int n=arr.length;
    	for(int i=0;i<n;i++)
    	{
    		int mult=arr[i];
    		// traversing in current subarray
    		for(int j=i+1;j<n;j++)
    		{
    			result=Math.max(mult, result);
    					mult*=arr[j];
    		}
    		// updating the result for (n-1)th index.
            result = Math.max( mult,result);
    			
    	}
		return result;
    	
    }
   
	public static void main(String[] args) {
 
		int arr[]= {10,20,30,0,70,80,20};
        System.out.println("Maximum sub Array product is : " + maxSubarrayProduct(arr) );
        
	}

}

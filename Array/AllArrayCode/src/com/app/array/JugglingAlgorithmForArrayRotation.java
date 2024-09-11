package com.app.array;

public class JugglingAlgorithmForArrayRotation {
    // Function to find the greatest common divisor (GCD) of two numbers
     public static int gcd(int a,int b)
     {
    	 return (b==0)?a:gcd(b,a%b);
     }
     // Function to left rotate the array by 'd' positions
     public static void leftRotate(int arr[], int d, int n) {
         d = d % n; // In case d is greater than n
         int gcd = gcd(d, n);

         for (int i = 0; i < gcd; i++) {
             int temp = arr[i];
             int j = i;

             while (true) {
                 int k = j + d;
                 if (k >= n) k = k - n;
                 if (k == i) break;

                 arr[j] = arr[k];
                 j = k;
             }
             arr[j] = temp;
         }
     }

	public static void main(String[] args) {
 
		int arr[]= {10,20,30,40,50,60,70};
		int no_of_rotation=3;
		int n=arr.length;
		System.out.println("Arrays Elements before rotating : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+",");
			
		}
		System.out.println();
		leftRotate(arr,no_of_rotation,n);
		System.out.println("Arrays Elements After rotating : ");
		for(int i=0;i<n;i++)
		{
			System.out.print(arr[i]+",");
			
		}

 
		
	}

}

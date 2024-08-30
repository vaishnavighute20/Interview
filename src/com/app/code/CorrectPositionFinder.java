package com.app.code;

// coupa company code asked
public class CorrectPositionFinder {

	public static void main(String[] args) {
     int[] numbers= {5,2,3,6,1};
     System.out.println("Digits in the Correct Position:");
   //  boolean found=false;
     for (int i=0;i<numbers.length;i++)
     {
    	 if(numbers[i]==i+1)
    	 {
    		//Index is 0-based ,so we check i+1 
    	     System.out.println(numbers[i]+ " ");
    	  //   found=true;
    	 }
     }
//     if (!found) {
//         System.out.println("None");
//     }

}
}
package com.app.array;

import java.util.Arrays;

public class ReplaceByRank {

     static void changeArr(int[] input) {
        // Copy input array into newArray
        int newArray[] = Arrays.copyOfRange(input, 0, input.length);
        
         Arrays.sort(newArray);
        
        //Replace each element in input array with its rank
        for (int i = 0; i < input.length; i++) {
            for (int j = 0; j < input.length; j++) {
                // Find the index of the current element in the sorted array
                if (newArray[j] == input[i]) {
                    // Replace the element with its rank (index + 1)
                    input[i] = j + 1;
                    // Exit the inner loop once the rank is found
                    break;
                }
            }
        }
    }
    
     public static void main(String[] args) {
         int[] arr = {100, 99, 98, 97, 96, 1, 3, 5, 7};
         changeArr(arr);
        // Print the modified array
        System.out.println(Arrays.toString(arr));
    }
}

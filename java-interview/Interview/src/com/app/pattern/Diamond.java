package com.app.pattern;

public class Diamond {

    public static void main(String[] args) {

        int n = 5;

        // Upper part of the diamond
        for (int i = 1; i <= n; i++) {
            // Print spaces (decreasing)
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print stars (increasing)
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Print stars (increasing, skip the first one)
            for (int j = 1; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        // Lower part of the diamond
        for (int i = 1; i < n; i++) {
            // Print spaces (increasing)
            for (int j = 1; j <= i; j++) {
                System.out.print(" ");
            }
            // Print stars (decreasing)
            for (int j = i; j < n; j++) {
                System.out.print("*");
            }
            // Print stars (decreasing, skip the last one)
            for (int j = i + 1; j < n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


/*
    *
   ***
  *****
 *******
*********
 *******
  *****
   ***
    *
    
    
      int n = 5;
        for (int i = 1; i <= n; i++) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int i = n - 1; i >= 1; i--) {
            for (int j = n; j > i; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    
    
    
    
    
    
    
*/
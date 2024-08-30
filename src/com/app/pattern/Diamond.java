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
*/
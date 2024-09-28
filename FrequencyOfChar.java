package com.app.string;

import java.util.Scanner;

public class FrequencyOfChar {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        // Convert the string to lowercase to handle case insensitivity
        str = str.toLowerCase();

        // Convert the string into a character array
        char[] string = str.toCharArray();
        int[] freq = new int[str.length()];

        int i, j;

        // Count frequency of each character
        for (i = 0; i < str.length(); i++) {
            if (string[i] != '0') {
                freq[i] = 1;
                for (j = i + 1; j < str.length(); j++) {
                    if (string[i] == string[j]) {
                        freq[i]++;
                        // Set string[j] to '0' to mark it as visited
                        string[j] = '0';
                    }
                }
            }
        }

        // Display the characters and their frequencies
        System.out.println("Characters and their corresponding frequencies:");
        for (i = 0; i < freq.length; i++) {
            if (string[i] != '0') {
                System.out.println(string[i] + " - " + freq[i]);
            }
        }

        sc.close();
    }
}

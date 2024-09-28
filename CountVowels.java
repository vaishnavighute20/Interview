package com.app.string;

 
public class CountVowels {

    public static void main(String[] args) {

        String str = "vaishnAvI";
        int vowel = 0;
        
        for (int i = 0; i < str.length(); i++) {
            char ch = Character.toLowerCase(str.charAt(i)); // Convert to lowercase
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                vowel++;
            }
        }

        System.out.println("Vowels: " + vowel);
    }
}

 
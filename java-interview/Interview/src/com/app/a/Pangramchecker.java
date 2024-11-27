package com.app.a;

import java.util.Scanner;

public class Pangramchecker {

	// Contains all letters from a to z
	public static void main(String[] args) {
 
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter a sentence: ");
        String str = sc.nextLine().toLowerCase();
        
        boolean isPangram=str.chars()//converts the sentence to a stream of characters.
                .filter(Character::isLetter)//ensures we only check letters.
                .distinct().count() == 26;// check all leter a to znare present  

    System.out.println("Contains all letters from a to z: " + isPangram);
}
}

package com.app.array;

import java.util.Stack;

public class Main {

    // Method to check if parentheses in the string are balanced
    public static boolean isBalancedParenthesis(String str) {
        Stack<Character> stack = new Stack<>();  // Use a generic Stack for Character

        // Traverse the string character by character
        for (int i = 0; i < str.length(); i++) {
            char x = str.charAt(i);

            // If current character is an opening bracket, push it to the stack
            if (x == '(' || x == '[' || x == '{') {
                stack.push(x);
                continue; // Continue to the next character
            }

            // If a closing bracket is encountered and stack is empty, return false
            if (stack.isEmpty()) return false;

            char check;
            // Check for closing brackets and their corresponding opening brackets
            switch (x) {
                case ')':
                    check = stack.pop();
                    if (check != '(') return false; // Mismatch found
                    break;

                case '}':
                    check = stack.pop();
                    if (check != '{') return false; // Mismatch found
                    break;

                case ']':
                    check = stack.pop();
                    if (check != '[') return false; // Mismatch found
                    break;
            }
        }

        // If stack is empty, all opening brackets had matching closing brackets
        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String str = "()(()){}";
        if (isBalancedParenthesis(str))
            System.out.println("True");
        else
            System.out.println("False");
    }
}

/*
 
 stack follows the Last-In-First-Out (LIFO) principle
Before handling any closing parenthesis, 
the program checks if the stack is empty. If it is empty,
 it means there is no corresponding opening parenthesis for the current closing one,
 and the method returns false.
If the stack is not empty, it means there are unmatched opening parentheses, 
so the method returns false.

If the stack is empty, all opening parentheses had matching closing ones, 
so the method returns true.

Algorithm :
Declare a character stack.
Now traverse the expression string exp.
If the current character is a starting bracket (‘(‘ or ‘{‘ or ‘[‘) then push it to stack.
If the current character is a closing bracket (‘)’ or ‘}’ or ‘]’) then pop from stack and if the popped character is the matching starting bracket then fine else brackets are not balanced.
After complete traversal, if there is some starting bracket left in stack then “not balanced”
*/
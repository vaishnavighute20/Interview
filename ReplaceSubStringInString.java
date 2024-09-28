package com.app.string;

public class ReplaceSubStringInString {

    public static void main(String[] args) {
        String originalString = "Hello, World!";
        String substringToReplace = "World";
        String replacement = "Java";

        // Replace the substring
        String modifiedString = replaceSubstring(originalString, substringToReplace, replacement);

        // Print the modified string
        System.out.println("Original String: " + originalString);
        System.out.println("Modified String: " + modifiedString);
    }

    public static String replaceSubstring(String original, String substringToReplace, String replacement) {
        // Check if the original string contains the substring to replace
        if (!original.contains(substringToReplace)) {
            return original; // If not, return the original string as it is
        }

        // Use the replaceAll method to replace all occurrences of the substring
        String modified = original.replaceAll(substringToReplace, replacement);
        return modified;
}
}

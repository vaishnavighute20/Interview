package com.app.code;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ReadDataFromTextFile {

    public static void main(String[] args) {
        // Approach 1: Using FileReader and BufferedReader
        try (FileReader fr = new FileReader("D:\\sequence.txt");
             BufferedReader br = new BufferedReader(fr)) {
             
            String line;
            // Read file line by line
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (FileNotFoundException e) {
            // Handle case where the file is not found
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            // Handle general I/O exceptions
            System.out.println("An error occurred while reading the file: " + e.getMessage());
        }
    }
}

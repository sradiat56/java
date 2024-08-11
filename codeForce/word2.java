package codeForce;

import java.util.Scanner;

public class word2 {
    public static void main(String[] args) {
          Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        scanner.close();
        
        int upperCount = 0;
        int lowerCount = 0;
        
        // Count uppercase and lowercase letters
        for (char c : s.toCharArray()) {
            if (Character.isUpperCase(c)) {
                upperCount++;
            } else if (Character.isLowerCase(c)) {
                lowerCount++;
            }
        }
        
        // Compare counts and convert accordingly
        if (upperCount > lowerCount) {
            System.out.println(s.toUpperCase());
        } else {
            System.out.println(s.toLowerCase());
        }
    }
    }


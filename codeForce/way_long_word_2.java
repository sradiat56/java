package codeForce;

import java.util.Scanner;

public class way_long_word_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.nextLine());  // Read the number of words
        
        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();  // Read each word
            if (word.length() > 10) {
                // Create abbreviation
                String abbreviated = word.charAt(0) + Integer.toString(word.length() - 2) + word.charAt(word.length() - 1);
                System.out.println(abbreviated);
            } else {
                // Print the word as it is
                System.out.println(word);
            }
        }

        scanner.close();
    }
}

package codeForce;

import java.util.Scanner;

public class long_word {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();  // Reads the integer
        scanner.nextLine();  // Consumes the newline character

        for (int i = 0; i < n; i++) {
            String word = scanner.nextLine();  // This will now correctly read each word
            if (word.length() > 10) {
                System.out.println(word.charAt(0) + String.valueOf(word.length() - 2) + word.charAt(word.length() - 1));
            } else {
                System.out.println(word);
            }
        }
        
        scanner.close();
    }
}

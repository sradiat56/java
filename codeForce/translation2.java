package codeForce;

import java.util.Scanner;

public class translation2 {
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        String n = sc.nextLine();
        sc.close();

        // Reverse the second string
        String reversedN = new StringBuilder(n).reverse().toString();

        // Check if the first string is equal to the reversed second string
        if (s.equals(reversedN)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}

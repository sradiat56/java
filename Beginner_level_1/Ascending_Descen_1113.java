package Beginner_level_1;

import java.util.Scanner;

public class Ascending_Descen_1113 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        
        while (true) {
            int X = sc.nextInt();
            int Y = sc.nextInt();
            
            if (X == Y) {
                break;
            }
            
            if (X < Y) {
                System.out.println("Crescente");
            } else {
                System.out.println("Decrescente");
            }
        }
        
        sc.close();
    }
}

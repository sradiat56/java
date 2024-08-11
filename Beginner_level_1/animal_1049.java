package Beginner_level_1;

import java.util.Scanner;

public class animal_1049 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the three input words
        String firstWord = scanner.nextLine();
        String secondWord = scanner.nextLine();
        String thirdWord = scanner.nextLine();

        String animal = "";

        // Determine the animal based on the words
        if (firstWord.equals("vertebrado")) {
            if (secondWord.equals("ave")) {
                if (thirdWord.equals("carnivoro")) {
                    animal = "aguia";
                } else if (thirdWord.equals("onivoro")) {
                    animal = "pomba";
                }
            } else if (secondWord.equals("mamifero")) {
                if (thirdWord.equals("onivoro")) {
                    animal = "homem";
                } else if (thirdWord.equals("herbivoro")) {
                    animal = "vaca";
                }
            }
        } else if (firstWord.equals("invertebrado")) {
            if (secondWord.equals("inseto")) {
                if (thirdWord.equals("hematofago")) {
                    animal = "pulga";
                } else if (thirdWord.equals("herbivoro")) {
                    animal = "lagarta";
                }
            } else if (secondWord.equals("anelideo")) {
                if (thirdWord.equals("hematofago")) {
                    animal = "sanguessuga";
                } else if (thirdWord.equals("onivoro")) {
                    animal = "minhoca";
                }
            }
        }

        // Print the determined animal
        System.out.println(animal);

        scanner.close(); 
    }
}

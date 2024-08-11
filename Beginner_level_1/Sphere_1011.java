package Beginner_level_1;

import java.util.Scanner;

public class Sphere_1011 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
        double pi=3.14159;
        double vol=(4.0/3) * pi * (r*r*r);
        System.out.printf("VOLUME = %.3f",vol);
        sc.close();
    }
}

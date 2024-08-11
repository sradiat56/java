package Beginner_level_1;

import java.util.Scanner;

public class multiplication_1078 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=10;i++){
            int mul=i*n;
            System.out.println(i+" x "+n+" = "+mul);
        }
    }
}

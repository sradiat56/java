package Beginner_level_1;

import java.util.Scanner;

public class Greatest_1013 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int n3=sc.nextInt();
        // if(n1>n2 && n1>n3){
        //     System.out.println(n1+" eh o maior");
        // }
        // else if(n2>n1 && n2>n3){
        //     System.out.println(n2+" eh o maior");
        // }
        // else if(n3>n1 && n3>n2){
        //     System.out.println(n3+" eh o maior");
        // }
        int great=n1;
        if(n2>great){
            great=n2;
        }
        if(n3>great){
            great=n3;
        }
        System.out.println(great);
        sc.close();
    }
}

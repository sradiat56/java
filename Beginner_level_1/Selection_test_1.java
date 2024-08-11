package Beginner_level_1;

import java.util.Scanner;

public class Selection_test_1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        int d=sc.nextInt();
        if(b>c && d>a && c+d>a+b && a%2==0){
            
                System.out.println("Valores aceitos");
        }
        else{
            System.out.println("Valores no aceitos");
        }
    }
}

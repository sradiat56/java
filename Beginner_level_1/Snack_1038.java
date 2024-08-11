package Beginner_level_1;

import java.util.Scanner;

public class Snack_1038 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1 Cachorro Quente R$ 4.00");
        System.out.println("2 X-Salad Quente R$ 4.50");
        System.out.println("3 X-Bacon R$ 5.00");
        System.out.println("4 Torrada simple R$ 2.00");
        System.out.println("5 Refrigenate R$ 1.50");
        int x=sc.nextInt();
        int y=sc.nextInt();
        double sum=0.0;
        if(x==1){
            sum=y*4;
        }
        if(x==2){
            sum=y*4.5;
        }
        if(x==3){
            sum=y*5;
        }
        if(x==4){
            sum=y*2;
        }
        if(x==5){
            sum=y*1.5;
        }
        System.out.println("Total: R$ "+sum );
    }
}

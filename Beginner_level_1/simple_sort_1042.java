package Beginner_level_1;

import java.util.Scanner;

public class simple_sort_1042 {
    public static void main(String[] args) {
          Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double temp=0;
        if(a>b){
          temp=a;
            a=b;
            b=temp;
        }if(a>c){
            temp=a;
            a=c;
            c=temp;
        }if(b>c){
            temp=b;
            b=c;
            c=temp;
        }
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}

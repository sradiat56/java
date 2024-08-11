package Beginner_level_1;

import java.util.Scanner;

public class Simple_calculate_1010 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("price of products: 1. 5.30tk");
        System.out.println("price of products: 2. 5.10tk");
        System.out.println("price of products: 3. 15.75tk");
        System.out.println("put the code of a product 1");

        int n1=sc.nextInt();
        System.out.println("put the number of units of product 1");
       
        int n2=sc.nextInt();
        double p1=sc.nextDouble();
        double t1=n2*p1; 
        System.out.println("put the code of a product 2");
        int n3=sc.nextInt();
        System.out.println("put the number of units of product 2");
        double n4=sc.nextDouble();
        double p2=sc.nextDouble();
        double t2=n4*p2;
        double total=t1+t2;
       System.out.printf("VALOR A PAGAR: R$ %.2f ",total);
       sc.close();

    }
}

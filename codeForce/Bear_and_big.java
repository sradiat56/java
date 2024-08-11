package codeForce;

import java.util.Scanner;

public class Bear_and_big {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n1=sc.nextInt();
        int n2=sc.nextInt();
        int count=0;
        boolean checker=false;
        while(!checker){
            if(n1>n2){
                checker=true;
            }
            else{
                n1=n1*3;
                n2=n2*2;
                count++;
            }
           
        }
        System.out.println(count);

    }
}

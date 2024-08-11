package codeForce;

import java.util.Scanner;

public class tram {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int currentpassengers=0;
        int maxPassengers=0;
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            currentpassengers=currentpassengers-a+b;
            if(currentpassengers>maxPassengers){
                maxPassengers=currentpassengers; 
            }
        }
        System.out.println(maxPassengers);
    }
}

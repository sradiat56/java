package Beginner_level_1;

import java.util.Scanner;

public class fixed_pass {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int pass=2002;
        while(true){
            int n=sc.nextInt();
            if(n==pass){
                System.out.println("Acesso Permitido");
                break;
            }
            else{
                System.out.println("Senha Invalida");
            }
        }
    }
}

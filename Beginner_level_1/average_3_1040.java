package Beginner_level_1;

import java.util.Scanner;

public class average_3_1040 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double a=sc.nextDouble();
        double b=sc.nextDouble();
        double c=sc.nextDouble();
        double d=sc.nextDouble();
        double aveg=(a+b+c+d)/4;
        System.out.println("Media: "+aveg);
        if(aveg>=7){
            System.out.println("Aluno aprovada");
        }
        else if(aveg<5){
            System.out.println("Aluno reprovado.");
        }
        else if(aveg>=5 && aveg<=6.9){
            System.out.println("Aluno em exame.");
        }
    }
}

package Beginner_level_1;

import java.util.Scanner;

public class salary_increase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double n=sc.nextDouble();
        double earn=0;
        double sum=0;
        int per=0;
        if(n>=0 && n<=400){
            earn=n*0.15;
            sum=n+earn;
           per=15;
        }
        else if(n>400 && n<=800){
            earn=n*0.12;
            sum=n+earn;
            per=12;
        }
        else if(n>400 && n<=800){
            earn=n*0.10;
            sum=n+earn;
            per=10;
        }
        System.out.println("New Salary "+sum);
        System.out.println("Money earned "+earn);
        System.out.println("In percentage "+per);
    }
}

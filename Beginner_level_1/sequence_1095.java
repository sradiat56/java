package Beginner_level_1;

import java.util.Scanner;

public class sequence_1095 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //int n=sc.nextInt();
        int i=1;
        int j=60;
        while (j>=0) {
                System.out.println("I="+i+" J="+j);
                i+=3;
                j-=5;
                
        }
    }
}

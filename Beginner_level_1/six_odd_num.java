package Beginner_level_1;

import java.util.Scanner;

public class six_odd_num {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=n;i<=(n+11);i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
    }
}

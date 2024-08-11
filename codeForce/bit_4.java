package codeForce;

import java.util.Scanner;

public class bit_4 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        sc.nextLine();
        int x=0;
        for(int i=0;i<n;i++){
            String s=sc.nextLine().trim();
            if(s.contains("x++")){
                x++;
            }else if(s.contains("++x")){
                x++;
            }else if(s.contains("--x")){
                --x;
            }else if(s.contains("x--")){
                x--;
            }
        }
        System.out.println(x);
        }
    }


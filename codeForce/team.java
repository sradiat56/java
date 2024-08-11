package codeForce;

import java.util.Scanner;

public class team {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int count=0;
        for(int i=1;i<=n;i++){
            int x=sc.nextInt();
            int y=sc.nextInt();
            int z=sc.nextInt();
            if(x==1 && y==1){
                count++;
            }else if(y==1 && z==1){
                count++;
            }else if(x==1 && z==1){
                count++;
            }
         }
         System.out.println("accepted = "+count);
    }
}

package Beginner_level_1;

import java.util.Scanner;

public class Expertiments_1094 {
    public static void main(String[] args) {
       Scanner sc=new Scanner(System.in);
        
        int experi=sc.nextInt();
        int totalrabi=0;
        int totalrat=0;
        int totalfr=0;
        int sum=0;
        for(int i=0;i<experi;i++){
            int n=sc.nextInt();
            String animal=sc.next();
            char ch=animal.charAt(0);
            sum+=n;
            if(ch=='C'){
                totalrabi+=n;
            }
            else if(ch=='R'){
                totalrat+=n;
            }
            else if(ch=='S'){
                totalfr+=n;
            }

        }
        double per=(totalrabi/(double)sum) *100;
        double per2=(totalrat/(double)sum) *100;
        double per3=(totalfr/(double)sum) *100;
        System.out.println("Total: "+sum +"cobaias");
        System.out.println("Total de coelhos: "+totalrabi);
        System.out.println("Total de ratos: "+totalrat);
        System.out.println("Total de sapos: "+totalfr);
         System.out.printf("Percentual de coelhos: %.2d % \n",per);
         System.out.printf("Percentual de ratos: %.2d % \n",per2);
         System.out.printf("Percentual de sapos: %.2d % \n",per3);
    }
}

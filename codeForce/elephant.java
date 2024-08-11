package codeForce;
import java.util.Scanner;
public class elephant {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        // int q=0;
        // int r=0;
        // while(x!=0){
        //     if(x>=5){
        //         q=x/5;
        //         r=x%5;
        //         if(r>0){
        //             q+=1;
        //         }
        //     }
           
        //     x=x/5;
        // }
        int steps=(x+4)/5;
        System.out.println(steps);
    }
}

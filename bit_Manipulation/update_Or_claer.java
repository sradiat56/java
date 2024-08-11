package bit_Manipulation;

import java.util.Scanner;

public class update_Or_claer {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=5;
        int pos=2;
        int oper=sc.nextInt();
        int bitmask=1<<pos;
        if(oper==1){
            //set 1
            int newn=bitmask | n;
            System.out.println(newn);
        }
        else{
            // clear 0
            int newbitmask = ~(bitmask);
            int newn= newbitmask & n;
            System.out.println(newn);
        }
    }
}

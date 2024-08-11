package array_problems;

import java.util.Scanner;

public class anime_size {
    public static void main(String[] args) {
         Scanner sc =new Scanner(System.in);
        String[] a = {"Elephant", "Tiger", "Kangaroo", "Giraffe", "Panda"};
        int[] w = {6000, 220, 85, 1200, 100};
        int[] h = {300, 90, 160, 500, 80};
        int chosse=-1;
        String s=sc.nextLine();
        for(int i=0;i<a.length;i++){
            if(a[i].equalsIgnoreCase(s)){
                chosse=i;
                break;
            }
        }
        if(chosse==-1){
            System.out.println("not valid");
            return;
        }
        int selectw= w[chosse];
        int selecth= h[chosse];
        int select=0;
        double min=Double.MAX_VALUE;
        for(int i=0;i<a.length;i++){
            if(i!=chosse){
            int compw=w[i];
            int compf=h[i];
            double dis=Math.sqrt(Math.pow(selectw-w[i],2)+Math.pow(selecth-h[i],2));
            if(dis<min){
                min=dis;
                select=i;
            }
        }
        }
        System.out.println("closet "+a[select]);

    }
}

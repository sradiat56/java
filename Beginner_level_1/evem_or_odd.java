package Beginner_level_1;
import java.util.Scanner;
public class evem_or_odd {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        for(int i=0;i<=n;i++){
            int x=scanner.nextInt();
            if(x==0){
                System.out.println("null");
            }else{
             String mess="";
             if(x%2==0){
                mess+="even";
             }else{
                mess+="odd";
             }
             if(x>0){
                mess+=" positive";
             }else{
                mess+=" negative";
             }
             System.out.println(mess);
        }
        
        }
    }
}

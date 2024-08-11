package Calculator;
import java.util.Scanner;

public class calcu{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("1-add \n2- subtract \n3- multiply \n4- divide ");
        int operator =sc.nextInt();
        System.out.print("enter first number: ");
        int n1=sc.nextInt();
        System.out.print("enter second number: ");
        int n2=sc.nextInt();
        
        int result=0;
        switch (operator) {
            case 1:
                result=n1+n2;
                break;
            case 2:
                result=n1-n2;
                break;
            case 3:
                result=n1*n2;
                break;
            case 4:
                result=n1/n2;
                break;    
            default:
            System.out.println("enter opertor is invalid");
                break;
        }
        System.out.println("result is "+result);
    }
}
    


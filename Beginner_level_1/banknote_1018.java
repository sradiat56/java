package Beginner_level_1;
import java.util.Scanner;
public class banknote_1018 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int note100=n/100;
        int note50=(n%100)/50;
        int note20=((n%100)%50)/20;
        int note10=(((n%100)%50)%20)/10;
        int note5=((((n%100)%50)%20)%10)/5;
        int note2=(((((n%100)%50)%20)%10)%5)/2;
        int note1=((((((n%100)%50)%20)%10)%5)%2)/1;
        System.out.println(note100+" nota(s) de R$ 100,00");
        System.out.println(note50+" nota(s) de R$ 50,00");
        System.out.println(note20+" nota(s) de R$ 20,00");
        System.out.println(note10+" nota(s) de R$ 10,00");
        System.out.println(note5+" nota(s) de R$ 5,00");
        System.out.println(note2+" nota(s) de R$ 2,0o");
        System.out.println(note1+" nota(s) de R$ 1,0");
        sc.close();
    }
}

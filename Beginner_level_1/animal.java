package Beginner_level_1;

import java.util.Scanner;

public class animal {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String n1=sc.nextLine();
        String n2=sc.nextLine();
        String n3=sc.nextLine();
        if(n1.equals("vertibardo")){
            if(n2.equals("ave")){
                if(n3.equals("onivoro")){
                    System.out.println("aguia");
                }else if(n3.equals("carnivoro")){
                    System.out.println("pomba");
                }
            }else if(n2.equals("memifero")){
                if(n3.equals("onivoro")){
                    System.out.println("homem");
                }else if(n3.equals("herbivoro")){
                    System.out.println("vaca");
                }
            }
        }
    }
}

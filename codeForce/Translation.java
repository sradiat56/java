package codeForce;

import java.util.Scanner;

public class Translation {
    public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String n=sc.nextLine();
        boolean f=true;
        if (s.length() != n.length()) {
            System.out.println("no");
            return;
        }
        for(int i=0;i<s.length();i++){
          if(s.charAt(i)!=n.charAt(n.length()-1-i))
          {
            f=false;
            break;
          }
        }
        if(f){
            System.out.println("yes");
        }else 
        {
            System.out.println("no");
        }
    }
}

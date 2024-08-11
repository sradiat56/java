package codeForce;

import java.util.Scanner;

public class word {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int lowcount=0;
        int uppcount=0;
        for(int i=0;i<s.length();i++){
            char c=s.charAt(i);
            if(c>='a' && c<='z')
            {
                lowcount++;
            }
            else if(c>='A' && c<='Z')
            {
                uppcount++;
            }
        }
        String ns="";
        if(lowcount<uppcount)
        {
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c>='a' && c<='z'){
                    ns+=(char)(c-32);
                }
                else
                {
                    ns+=c;
                }
            }
        }
        else if(lowcount>=uppcount)
        {
            for(int i=0;i<s.length();i++){
                char c=s.charAt(i);
                if(c>='A' && c<='Z'){
                    ns+=(char)(c+32);
                }
                else
                {
                    ns+=c;
                }
            } 
        }
        System.out.println(ns);
    }
}

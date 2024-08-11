package codeForce;

public class wrong_subtraction {
    public static void main(String[] args) {
        int n=512;
        int x=4;
        while(x>0){
           if(n%10!=0){
            n=n-1;
           }
           else{
            n=n/10;
           }
            x--;
        }
        System.out.println(n);
    }
}

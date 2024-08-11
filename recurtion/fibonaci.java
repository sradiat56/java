package recurtion;

public class fibonaci {
    public static void main(String[] args) {
        int a=0,b=1;
        int n=7;
        System.out.println(a);
        System.out.println(b);
        printfib(a,b,n);
    }
    public static void printfib(int a,int b,int n){
         if(n==0){
            return;
         }
         int c=a+b;
         System.out.println(c);
         printfib(b, c, n-1);
    }
}

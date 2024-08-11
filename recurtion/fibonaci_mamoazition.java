package recurtion;

public class fibonaci_mamoazition {
    private static long[] fibocache;
    public static void main(String[] args) {
        int n=50;
        fibocache=new long[n+1];
        for(int i=0;i<=n;i++){
            System.out.println(fibonaci(i) +" ");
        }
        
    }
    private static long fibonaci(int n){
        if(n<=1){
            return n;
        }
        if(fibocache[n]!=0){
            return fibocache[n];
        }

        long nthfibo =fibonaci(n-1)+fibonaci(n-2);
        fibocache [n]=nthfibo;
        return nthfibo;
    }
}

package recurtion;

public class path_finds {
    public static int countpath(int i,int j, int n,int m){
        if(i==n || j==m){
            return 0;
        }
        if(i==n-1  && j== m-1){
            return 1;
        }
        // right move
        int rightpath = countpath(i+1, j, n, m);
        
        //down move
       int downpath =countpath(i, j+1, n, m);
        return rightpath+downpath;
    }
    public static void main(String[] args) {
        int n=3,m=3;
        int total =countpath(0, 0, n, m);
        System.out.println(total);
    }
}

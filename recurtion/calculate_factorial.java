package recurtion;

public class calculate_factorial {
    public static void main(String[] args) {
        int n=5;
        int ans=calfac(n);
        System.out.println(ans);

    }
    public static int calfac(int n){
        if(n==1 || n==0){
            return 1;
        }
        int cal_nm1=calfac(n-1);
        int cal_n=n*cal_nm1;
        return cal_n;
    }
}

package array_problems;
import java.util.Arrays;
import java.util.Scanner;
public class maxmum_in_arr {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=3;
        int max=0;
        int [] ans=new int[n];
        for(int i=0;i<n;i++){
            int sum=0;
            int[] arr=new int[n];
            for(int j=0;j<n;j++){
                arr[j]=sc.nextInt();
                sum+=arr[j];
            }
            if(i==0){
                max=sum;
                ans=arr;
            }
            else if(sum>max){
                max=sum;
                ans=arr;
            }
        }
        System.out.println(Arrays.toString(ans));
        // for(int i=0;i<n;i++){
        //     System.out.println(ans[i]);
        // }
    }
}

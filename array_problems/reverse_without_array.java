package array_problems;

import java.util.Arrays;
import java.util.Scanner;

public class reverse_without_array {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println(Arrays.toString(arr));
        // for(int i=0;i<n/2;i++){
        //     int temp = arr[i];
        //     arr[i]=arr[n-i-1];
        //     arr[n-i-1]=temp;
        // }
        // System.out.println(Arrays.toString(arr));

        // asending order
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    if(arr[i]<arr[j]){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                    }
                }
            }
            System.out.println(Arrays.toString(arr));
    }
}

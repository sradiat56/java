package array_problems;

import java.util.Scanner;

public class find_all_target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int[] arr={1,2,3,4,5,6};

        int target=sc.nextInt();
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(i+" "+j);
                }
            }
        }
    }
}

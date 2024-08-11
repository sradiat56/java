package array_problems;

import java.util.Scanner;

public class find_target {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int [] arr={1,2,3,4,5,6,7};
        int target=sc.nextInt();
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                
                if(arr[i]+arr[j]==target){
                    System.out.println("found "+" "+arr[i]+ " " +" "+arr[j]);
                    count++;
                    break;
                }
            }
            if(count==1){
                break;
            }
        }
    }
}

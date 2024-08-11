package array_problems;

import java.util.Arrays;

public class find_first_missing_num {
    public static void main(String[] args) {
        int[] num={3,2,4,1};
        int n=num.length;
        for(int i=0;i<n;i++){
            while(num[i]>0 && num[num[i]-1]!=num[i] && num[i]<n){
                int temp=num[num[i]-1];
                num[num[i]-1]=num[i];
                num[i]=temp;

            }
        }
        System.out.println(Arrays.toString(num));
        int firstMissingNum=n+1;
        for(int i=0;i<n;i++){
            if(num[i]!= i+1){
                firstMissingNum=i+1;
                break;
            }
        }
        System.out.println("first missing num "+firstMissingNum);
    }
}

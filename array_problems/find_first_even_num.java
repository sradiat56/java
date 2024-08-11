package array_problems;

import java.util.Arrays;

public class find_first_even_num {
    public static void main(String[] args) {
        int[] num={3,7,2,4,1};
        int n=num.length;
        for(int i=0;i<n;i++){
            while(num[i]>0 && num[i]<n && num[num[i]-1]!=num[i]){
                int temp =num[num[i]-1];
                num[num[i]-1]=num[i];
                num[i]=temp;
            }
        }
        System.out.println(Arrays.toString(num));
        int first=0;
        if((n+1)%2==0){// to make it odd (n+1)%2!=0
            first=(n+1);
        }
        for(int i=0;i<n;i++){
            if(num[i]!=i+1){
                if((i+1)%2==0){// to make it odd (n+1)%2!=0
                    first=i+1;
                    break;
                }
            }
        }
        System.out.println("misisng" +first);
    }
}

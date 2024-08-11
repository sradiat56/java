package array_problems;

import java.util.Arrays;

public class find_first_sorted {
    public static void main(String[] args) {
        int[] num={-3, -2, 1, 2, 3, 5};
        int n=num.length;
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

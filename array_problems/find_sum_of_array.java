package array_problems;

public class find_sum_of_array {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int target=5;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    count++;
                }
                
            }
            if(arr[i]==target){
                count++;
            }
        }
        System.out.println(count);
    }
}

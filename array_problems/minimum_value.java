package array_problems;

public class minimum_value {
    public static void main(String[] args) {
        int []arr={5,7,6,3,1};
        int min=arr[0];
        for (int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println(min);
    }
}

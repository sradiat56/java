package array_problems;

public class find_mising_num_sorted {
    public static void main(String[] args) {
        int[] num={-4,-3,-2,-1,2,3,5,7};
        int missing=1;
        for(int i=0;i<num.length;i++){
            if(num[i]==missing){
                missing++;
            }
        }
        System.out.println("next missing num "+missing);
    }
}

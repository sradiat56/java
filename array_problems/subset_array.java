package array_problems;

public class subset_array {
    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        int arr1[]={5,6,7,8,9};
        int arr2[]={5,6,7};
        int count=1;
        for(int i=0;i<arr2.length;i++){
            boolean f=false;
            for(int j=0;j<arr1.length;j++){
                if(arr1[j]==arr2[i]){
                    f=true;
                    break;
                }
            }
            if(f==false){
                count=0;
                break;
            }

        }
        if(count==1){
            System.out.println("subset");
        }
        else{
            System.out.println("not subset");
        }
        
    }
}

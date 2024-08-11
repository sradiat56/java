package recurtion;

public class num_of_ways_to_invite {
    public static int callguest(int n){
        if(n <= 1){
            return 1;
        }
        //sigle
        int way1 = callguest(n-1);

        //pair
        int way2= callguest(n-2)*(n-1);
        
        return way1+way2;
    } 
    public static void main(String[] args) {
        int n=4;
        System.out.println(callguest(n));
     }
}

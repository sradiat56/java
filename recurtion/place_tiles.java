package recurtion;

public class place_tiles {
    public static int place_tiles(int n,int m){
        if (n==m){
            return 2;
        }
        if(n<m){
            return 1;
        }
         //vertically
         int verticalplace=place_tiles(n-m, m);

         //horizonally
         int horizatalplace=place_tiles(n-1, m);

         return verticalplace+horizatalplace;
    }
    public static void main(String[] args) {
        int n=4,m=2;
        System.out.println(place_tiles(n, m));
    }
}

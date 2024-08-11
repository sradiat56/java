package array_problems;
import java.util.Scanner;
public class close_city {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        String[] c={"New York", "Los Angeles", "Chicago", "Houston", "Phoenix"};
        int [] la ={40, 34, 41, 29, 33};
        int []lo= {-74, -118, -87, -95, -112};
        
        int chosse=-1;
        String city=sc.nextLine();
        for(int i=0;i<c.length;i++){
            if(c[i].equalsIgnoreCase(city)){
                chosse=i;
                break;
            }
        }
        if(chosse==-1){
            System.out.println("no valid");
            return;
        }
        double min=Double.MAX_VALUE;
        int colse=-1;
        for(int i=0;i<c.length;i++){
            if(i!=chosse){
                double distance=Math.sqrt(Math.pow(la[i]-la[chosse],2)+Math.pow(lo[i]-lo[chosse],2));
                if(distance<min){
                    min=distance;
                    colse=i;
                }
            }
        }
        System.out.printf("close is %s distance %.2f",c[colse],min);
    }
}

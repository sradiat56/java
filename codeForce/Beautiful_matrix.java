package codeForce;
import java.util.Scanner;
public class Beautiful_matrix {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int n=3;
        int [][] arr=new int[n][n];
        for(int i=0;i<n;i++){
            for(int j=n;j<n;j++){
                arr[i][j]=sc.nextInt();
            }
        } 
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}

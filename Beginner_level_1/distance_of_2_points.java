package Beginner_level_1;

import java.util.Scanner;

public class distance_of_2_points {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        double x1=sc.nextDouble();
        double x2=sc.nextDouble();
        double y1=sc.nextDouble();
        double y2=sc.nextDouble();
        double d= Math.pow(x2-x1,2)+Math.pow(y2-y1, 2);
        double distance =Math.sqrt(d);
        System.out.println(distance);
        sc.close();
    }
}

package Java_Projects.car_rental_system;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        carRentalSystem rentalSystem=new carRentalSystem();

        car car1=new car("C01", "toyota", 60 ); 
        car car2=new car("C02", "marcities", 120 ); 
        car car3=new car("C03", "benz", 200 ); 
        rentalSystem.addcar(car1);
        rentalSystem.addcar(car2);
        rentalSystem.addcar(car3);

        rentalSystem.menu();
    }
}

package Java_Projects.car_rental_system;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class carRentalSystem {
    private List<car> cars;
    private List<customer> Customers;
    private List<rental> rentals;

    public carRentalSystem(){
        cars= new ArrayList<>();
        Customers=new ArrayList<>();
        rentals=new ArrayList<>();

    }
    public void addcar(car car){
        cars.add(car);
    }
    public void addcustomer(customer customer){
        Customers.add(customer);
    }
    public void addrental(rental rental){
        rentals.add(rental);
    }
    public void  rentcar(car car,customer customer,int days){
        if(car.isAvailable()){
            car.rent();
            rentals.add(new rental(car, customer, days));
        }
        else{
            System.out.println("car in not availble");
        }
    }
    public void returncar(car car){
        car.returnCar();
        rental rentalToRemove =null;
        for(rental rental : rentals){
            if(rental.getCar()==car){
                rentalToRemove=rental;
                break;
            }
        }
        if(rentalToRemove!=null){
            rentals.remove(rentalToRemove);
            System.out.println("car returned successfully");
        }else{
            System.out.println("car was not rented");
        }
    }
    public void menu(){
        Scanner sc=new Scanner(System.in);

    while(true){
        System.out.println("car rental system");
        System.out.println("1. rent a car ");
        System.out.println("2. return a car");
        System.out.println("3. Exit");
        System.out.print("Enter your choice: ");
        int choice=sc.nextInt();
        sc.nextLine();
        if(choice==1){
            System.out.print("\n rent a car\n");
            System.out.print("Enter your name ");
            String customerName=sc.nextLine();
            System.out.print("\n Available cars: ");
            for(car car: cars){
                if(car.isAvailable()){
                    System.out.println(car.getCarid()+" - "+car.getModel());
                }
            }
            System.out.print("\nEnter the name id you want to rent ");
            String carID=sc.nextLine();

            System.out.print("Enter the number of days for rental");
            int rentalDays=sc.nextInt();

            sc.nextLine();

            customer newCustomer=new customer("cus"+(Customers.size()+1), customerName);
            addcustomer(newCustomer);

            car selectedCar= null;
            for(car car :cars){
                if(car.getCarid().equals(carID) && car.isAvailable()){
                    selectedCar=car;
                    break;
                }
            }
            if(selectedCar!=null){
                double totalprice=selectedCar.calculatePrice(rentalDays);
                System.out.println("\n== rental info == \n");
                System.out.println("Customer id: "+newCustomer.getId());
                System.out.println("Customer name: "+newCustomer.getName());
                System.out.println("Car: "+selectedCar.getModel());
                System.out.println("rental days: "+rentalDays);
                System.out.println("total price: "+totalprice);

                System.out.print("\n confirm rental (Y/N): ");
                String confirm=sc.nextLine();

                if(confirm.equalsIgnoreCase("y")){
                    rentcar(selectedCar, newCustomer, rentalDays);
                    System.out.println("\ncar rented successfully.");
                }
                else{
                    System.out.println("rental canceled");
                }

            }
        }
        else if(choice==2){
            System.out.println("\n== return a car ==\n");
            System.out.println("Enter the car id you want return: ");
            String carID=sc.nextLine();

            car cartoReturn=null;
            for(car car: cars){
                if(car.getCarid().equals(carID) && !car.isAvailable()){
                    cartoReturn=car;
                    break;
                }
            }
            if(cartoReturn !=null){
                customer customer=null;
                for(rental rental:rentals){
                    if(rental.getCar()==cartoReturn){
                        customer=rental.getCustomer();
                        break;
                    }
                }
                if(customer!= null){
                    returncar(cartoReturn);
                    System.out.println("car returned by "+customer.getName());
                }
                else{
                    System.out.println(("car was not rented or rental info is missing"));
                }
            }
            else{
                System.out.println("invalid car id or car in not rented");
            }
        }
        else if(choice==3){
            break;
        }
        else{
            System.out.println("invalid choice.");
        }
    }
    }
}

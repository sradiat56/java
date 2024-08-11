package Java_Projects.car_rental_system;

public class rental {
    private car Car;
    private customer customer;
    private int days;

    public rental(car car,customer Customer,int days){
        this.Car=car;
        this.customer=Customer;
        this.days=days;
    }

    public car getCar() {
        return Car;
    }

    public void setCar(car car) {
        Car = car;
    }

    public customer getCustomer() {
        return customer;
    }

    public void setCustomer(customer customer) {
        this.customer = customer;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }
    
}

package Java_Projects.car_rental_system;

public class car {
    private String carid;
    private String model;
    private int basePrice;
    private boolean isAvailable;
    public car(String id,String model,int price){
        this.carid=id;
        this.basePrice=price;
        this.isAvailable=true;
        this.model=model;
    }
    public String getCarid() {
        return carid;
    }
    public void setCarid(String carid) {
        this.carid = carid;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public int getBasePrice() {
        return basePrice;
    }
    public void setBasePrice(int basePrice) {
        this.basePrice = basePrice;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public void setAvailable(boolean isAvailable) {
        this.isAvailable = isAvailable;
    }
    public double calculatePrice(int rentalDays){
        return basePrice*rentalDays;
    }
    public void rent(){
        this.isAvailable=false;
    }
    public void returnCar(){
        isAvailable=true;
    }
}

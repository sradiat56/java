package Java_Projects.pizza_bill_app;

public class private_bill {
    private int price;
    private boolean veg;

    private int cheesePrice=100;
    private int toppingPrice=100;

    public private_bill(boolean veg){
        this.veg=veg;
        if(this.veg){
            this.price=300;
        }
        else{
            this.price=400;
        }
    }
    public void addcheese(){
        System.out.println("add cheese");
        this.price+=cheesePrice;
    }
    public void addtopings(){
        System.out.println("add cheese");
        this.price+=toppingPrice;
    }
    public int getbill(){
        return this.price;
    }

}

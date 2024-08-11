package Java_Projects.pizza_bill_app;

public class bill {
    String type;
    String variant;
    int price;
    int count=1;
    bill(String type){
        this.type=type;
        this.variant="none";
    }
    bill(String type,String variant){
        this.type=type;
        this.variant=variant;
    }

    void billprice(){
        if(count==1){
            if(this.variant.equals("veg")){
                this.price+=300;
            }
            else if(this.variant.equals("non-veg")){
                this.price+=300;
            }
            else{
                this.price+=600;
            }
            System.out.println("total price is: "+this.price);
            count++;
        }
        else{
            System.out.println("total price is: "+this.price);
        }
    }
    void takeaway(){
        this.price+=20;
    }
    void addchesse(){
        this.price+=100;
    }
    void addtopings(){
        this.price+=100;
    }
}

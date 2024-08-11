package Java_Projects.pizza_bill_app;

public class pizza {
    public static void main(String[] args) {
        // bill piza1=new bill("base", "veg");
        // piza1.addchesse();
        // piza1.addtopings();
        // piza1.billprice();
        // piza1.billprice();
        // bill piza2=new bill("delux");
        // piza2.takeaway();
        // piza2.billprice();
        delux_pizza dp=new delux_pizza(true);
        dp.addcheese();
        System.out.println(dp.getbill());
    }
}

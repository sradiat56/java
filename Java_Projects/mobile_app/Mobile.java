package Java_Projects.mobile_app;

public class Mobile {
   private String name;
   private String ops;
   private int battery=100;
   private int screen;
    public Mobile(int size,String name,String ops){
        this.name=name;
        this.ops=ops;
        this.screen=size;
    }
   public int getbattery(){
    return battery;
   }

   public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public String getOps() {
    return ops;
}
public void setOps(String ops) {
    this.ops = ops;
}

   public void takepic(){
    if (battery>10) {
        System.out.println("pic has taken");
    this.battery-=10;
    }
    else{
        System.out.println("not enough charge ");
    }
   }
   public void takevdo(){
    if (battery>30) {
        System.out.println("vdo has taken");
    this.battery-=30;
    }
    else{
        System.out.println("not enough charge ");
    }
    
   }
   public void playgame(){
    if (battery>50) {
        System.out.println("game played");
    this.battery-=50;
    }
    else{
        System.out.println("not enough charge ");
    }
   }
   public void charge(){
    this.battery=100;
   }

}

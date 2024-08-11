package Java_Projects.vehicle;

public class CAR extends vehicle{
    private int doors;
    private int gears;
    private int wheel;
    private String type;
    private boolean isManual;
    private int currentgear;
    
    public CAR(String name,int wheels,int doors,int gears,boolean ismanual,String type){
        super(name);
        this.type=type;
        this.wheel=wheels;
        this.doors=doors;
        this.isManual=ismanual;
        this.gears=gears;
        currentgear=1;
    }
    public void changegear(int gear){
        this.currentgear=gear;
        System.out.println("Gear changed "+this.currentgear);
    }
    public void changeSpeed(int newSpeed,int newDirection){
        move(newSpeed,newDirection);
        System.out.println("change speed "+newSpeed+" direction "+newDirection);
    }
}

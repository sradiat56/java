package Java_Projects.vehicle;

public class vehicle {
    private String name;
    private int currentSpeed;
    private int currentDirection;

    public vehicle(String name){
        this.name=name;
        this.currentDirection=0;
        this.currentSpeed=0;
    }
    public void steer(int direction){
        this.currentDirection+=direction;
        System.out.println("Steering at "+this.currentDirection);
    }
    public void move(int speed,int direction){
        currentDirection=direction;
        currentSpeed=speed;
        System.out.println("move method called :moving at "+currentSpeed+" in direction "+currentDirection);
    }
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public int getcurrtentSpeed(){
        return currentSpeed;
    }
    public int getcurrentDirection(){
        return currentDirection;
    }
    public void stop(){
        this.currentSpeed=0;
    }
}

package Java_Projects.vehicle;

public class Suv extends CAR{
    public Suv(String name,int gears,boolean isManual){
        super(name,4,5,gears,isManual,"suv");
    }
    public void accelerate(int rate){
        int newSpeed=getcurrtentSpeed()+rate;
        if(newSpeed==0){
            stop();
            changegear(1);
        }
        else if(newSpeed>0 && newSpeed<=10){
            changegear(1);
        }
        else if(newSpeed>10 && newSpeed<=20){
            changegear(2);
        }
        else if(newSpeed>20 && newSpeed<=30){
            changegear(3);
        }
        else{
            changegear(4);
        }
        if(newSpeed>0){
            changeSpeed(newSpeed, getcurrentDirection());
        }
    }
}

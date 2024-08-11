package Java_Projects.webseries;

public class bahubali {
    private int phypower;
    private int gunpower;
    private int wartactices;
    private int smartness;

    public bahubali(int physical, int gunpower,int wartactics,int smartness){
        this.gunpower=setSafeValue(gunpower);
        this.phypower=setSafeValue(physical);
        this.wartactices=setSafeValue(wartactics);
        this.smartness=setSafeValue(smartness);
    }
    private int setSafeValue(int value){
        int saveval;
        if(value>100){
            saveval=100;
        }else if(value<0){
            saveval=0;
        }
        else{
            saveval=value;
        }
        return saveval;
    }
    public int getAvgPower(){
        int average=this.gunpower+smartness+wartactices+phypower;
        return average;
    }
}

package bit_Manipulation;

public class clear {
    public static void main(String[] args) {
        int n=5;
        int pos=2;
        int bitmask=1<<pos;
        int newbitmask=~(bitmask);

        int newn=newbitmask & n;
        System.out.println(newn);
    }
}

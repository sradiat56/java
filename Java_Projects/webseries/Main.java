package Java_Projects.webseries;

public class Main {
    public static void main(String[] args) {
        kalenvai kalen=new kalenvai(60, 85, 95, 122);
        gundu gundu=new gundu(98, 12, 32, 90);
        munna munna=new munna(100, 100, 100, 100);
        System.out.println(kalen.getAvgPower());
        System.out.println(gundu.getAvgPower());
        System.out.println(munna.getAvgPower());
    }
}

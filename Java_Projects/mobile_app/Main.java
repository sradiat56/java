package Java_Projects.mobile_app;

public class Main {
    public static void main(String[] args) {
        Mobile poco=new Mobile(6,"apple","ios");
        poco.takepic();
       System.out.println(poco.getbattery());
    }
}

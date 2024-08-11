package Beginner_level_1;

import java.util.Scanner;

public class evemt_time_1061 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int startday=scanner.nextInt();
        int starthour=scanner.nextInt();
        int startmin=scanner.nextInt();
        int startsec=scanner.nextInt();
        int endday=scanner.nextInt();
        int endhour=scanner.nextInt();
        int endmin=scanner.nextInt();
        int endsec=scanner.nextInt();
        int startTotal=startday*24*3600+starthour*3600+startmin*60+startsec;
        int endTotal=endday*24*3600+endhour*3600+endmin*60+endsec;
        int durationSec= endTotal-startTotal;

        int day=durationSec/(24*3600);
        durationSec%=24*3600;
        int hour=durationSec/3600;
        durationSec%=3600;
        int min =durationSec/60;
        int sec=durationSec%60;
        System.out.println(day+" dia(s)");
        System.out.println(hour+" hora(s)");
        System.out.println(min+" minuto(s)");
        System.out.println(sec+" segundo(s)");


    }
}

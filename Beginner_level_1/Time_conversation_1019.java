package Beginner_level_1;

import java.util.Scanner;

public class Time_conversation_1019 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the duration in seconds
        int totalSeconds = scanner.nextInt();

        // Calculate hours, minutes, and seconds
        int hours = totalSeconds / 3600;
        int remainingSeconds = totalSeconds % 3600;
        int minutes = remainingSeconds / 60;
        int seconds = remainingSeconds % 60;

        // Print the result in the format hours:minutes:seconds
        System.out.printf("%d:%d:%d%n", hours, minutes, seconds);

        scanner.close();
    }
}

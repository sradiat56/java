package Beginner_level_1;

import java.util.Scanner;

public class interval_2_1072 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Read the number of test cases
        int N = scanner.nextInt();

        // Initialize counters for numbers in and out of the interval
        int inIntervalCount = 0;
        int outOfIntervalCount = 0;

        // Process each test case
        for (int i = 0; i < N; i++) {
            // Read the current number
            int X = scanner.nextInt();

            // Check if the number falls within the interval [10, 20]
            if (X >= 10 && X <= 20) {
                inIntervalCount++;
            } else {
                outOfIntervalCount++;
            }
        }

        // Print the results
        System.out.printf("%d in\n", inIntervalCount);
        System.out.printf("%d out\n", outOfIntervalCount);

        scanner.close();
    }
}

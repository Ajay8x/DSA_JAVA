package l4.loop;

import java.util.Scanner;

public class forloop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter number (how many times you want to print): ");
        int n = sc.nextInt();

        // Start timer
        long startTime = System.nanoTime();

        // Loop and print
        for (int i = n; i <= 10; i++) {
            System.out.println(";) " + i*n);
        }








        
        // End timer
        long endTime = System.nanoTime();

        // Calculate duration
        double durationMs = (endTime - startTime) / 1_000_000.0;

        // Show time taken
        System.out.println("Time taken: " + durationMs + " ms");
    }
}

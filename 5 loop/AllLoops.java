package l4.loop;

import java.util.Scanner;

public class AllLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number (how many times you want to print): ");
        int n = sc.nextInt();

        // ---------------- For Loop ----------------
        System.out.println("\n--- For Loop ---");
        long startFor = System.nanoTime();
        for (int i = 0; i <= n; i++) {
            System.out.println(";) " + i);
        }
        long endFor = System.nanoTime();
        double durationFor = (endFor - startFor) / 1_000_000.0;
        System.out.println("Time taken by for loop: " + durationFor + " ms");

        // ---------------- While Loop ----------------
        System.out.println("\n--- While Loop ---");
        int i = 0;
        long startWhile = System.nanoTime();
        while (i <= n) {
            System.out.println(";) " + i);
            i++;
        }
        long endWhile = System.nanoTime();
        double durationWhile = (endWhile - startWhile) / 1_000_000.0;
        System.out.println("Time taken by while loop: " + durationWhile + " ms");

        // ---------------- Do-While Loop ----------------
        System.out.println("\n--- Do-While Loop ---");
        int j = 0;
        long startDoWhile = System.nanoTime();
        do {
            System.out.println(";) " + j);
            j++;
        } while (j <= n);
        long endDoWhile = System.nanoTime();
        double durationDoWhile = (endDoWhile - startDoWhile) / 1_000_000.0;
        System.out.println("Time taken by do-while loop: " + durationDoWhile + " ms");
    }
}

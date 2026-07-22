package l4.loop;

import java.util.Scanner;

public class doWhileLoop {

    public static void main(String[] args) {
        System.out.println("\n--- Do-While Loop ---");

        Scanner sc = new Scanner(System.in);
        int choice;
        int marks;

        long startDoWhile = System.nanoTime();

        do {
            System.out.print("Enter 1 to input student marks or 0 to exit: ");
            choice = sc.nextInt();

            if (choice == 1) {
                System.out.print("Enter the student marks (out of 100): ");
                marks = sc.nextInt();

                if (marks > 90 && marks <= 100) {
                    System.out.println("This is Good");
                } else if (marks >= 60 && marks <= 89) {
                    System.out.println("This is also Good");
                } else if (marks >= 0 && marks < 60) {
                    System.out.println("This is Good as well");
                    System.out.println("Because marks don’t matter but our effort does.");
                } else {
                    System.out.println("Invalid marks! Please enter marks between 0 and 100.");
                }
            } else if (choice != 0) {
                System.out.println("Invalid choice! Please enter 1 or 0.");
            }

        } while (choice != 0);

        sc.close();

        long endDoWhile = System.nanoTime();
        double durationDoWhile = (endDoWhile - startDoWhile) / 1_000_000.0;
        System.out.println("Time taken by do-while loop: " + durationDoWhile + " ms");
    }
}

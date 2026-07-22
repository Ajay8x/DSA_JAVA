package conditional;

import java.util.Scanner;

public class calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input numbers
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();

        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();

        // Menu
        System.out.println("Choose an operation:");
        System.out.println("1: Addition");
        System.out.println("2: Subtraction");
        System.out.println("3: Multiplication");
        System.out.println("4: Division");

        // Input choice
        int button = sc.nextInt();

        // Perform operation
        switch (button) {
            case 1:
                System.out.println("Result = " + (num1 + num2));
                break;
            case 2:
                System.out.println("Result = " + (num1 - num2));
                break;
            case 3:
                System.out.println("Result = " + (num1 * num2));
                break;
            case 4:
                if (num2 != 0) {
                    System.out.println("Result = " + (num1 / num2));
                } else {
                    System.out.println("Cannot divide by zero.");
                }
                break;
            default:
                System.out.println("Invalid operation selected.");
                break;
        }

        sc.close();
    }
}

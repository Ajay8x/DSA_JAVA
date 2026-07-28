import java.util.*;

public class Syntax_with_parameter {
    // Method to calculate the sum of two integers with parameters
    public static int calculateSum(int a, int b) {//parameterized method formal parameters
        // Return the sum of the two integers
        return a + b;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompt the user for input
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Call the method with parameters 
        int sum = calculateSum(a, b);//actual parameters & arguments
        // Print the sum
        System.out.println("Sum is: " + sum);
        // Close the scanner
        sc.close();
    }
}
import java.util.Scanner;
public class find_product {
    // Method to calculate the product of two integers with parameters
    public static int calculateProduct(int a, int b) {
        // Return the product of the two integers
        return a * b;
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner sc = new Scanner(System.in);
        // Prompt the user for input
        int a = sc.nextInt();
        int b = sc.nextInt();
        // Call the method with parameters and print the result
        int product = calculateProduct(a, b);
        System.out.println("Product is: " + product);
        // Close the scanner
        sc.close();
    }
}
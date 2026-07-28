import java.util.Scanner;

public class find_fectorial {

    // find factorial of a number using recursion

    public static int findFactorial(int n) {
        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;

        }
        return factorial;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int factorial = findFactorial(n);
        System.out.println("Factorial of " + n + " is: " + factorial);
    }

}
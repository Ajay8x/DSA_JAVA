import java.util.Scanner;

public class check_prime_N_Range {

    // isPrime method to check if a number is prime or not
    public static boolean isPrime(int n) {

        if (n <= 1) {
            return false;
        }

        int sqrt = (int) Math.sqrt(n);

        for (int i = 2; i <= sqrt; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

    // Method to print all prime numbers in a given range
    public static void printPrimesInRange(int start, int end) {

        for (int num = start; num <= end; num++) {
            if (isPrime(num)) {
                System.out.print(num + " ");
            }
        }

    } 





    
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the starting number: ");
        int start = sc.nextInt();

        System.out.print("Enter the ending number: ");
        int end = sc.nextInt();

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        printPrimesInRange(start, end); 
        sc.close();
    }
}
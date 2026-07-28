import java.util.Scanner;

public class Binomial_Coefficient {
// 1 find factorial of a number using recursion
    public static int findFactorial(int n) {
        int factorial = 1;

        for (int i = 1; i <= n; i++) {
            factorial = factorial * i;
        }

        return factorial;
    }


// 2 find binomial coefficient of a number using factorial

    public static int binCoefficient(int n, int r) {

        int fact_n = findFactorial(n);
        int fact_r = findFactorial(r);
        int fact_n_r = findFactorial(n - r);

        int binomial_coefficient = fact_n / (fact_r * fact_n_r);

        return binomial_coefficient;
    }

    public static void main(String[] args) {



        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();

        System.out.print("Enter the value of r: ");
        int r = sc.nextInt();

        int result = binCoefficient(n, r);

        System.out.println("The binomial coefficient C(" + n + "," + r + ") is: " + result);

        sc.close();
    }
}
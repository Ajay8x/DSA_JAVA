
public class primeN {

    public static boolean isPrime(int n) {

        // Corner case
        if (n == 2) {
            return true;
        }

        for (int i = 2; i <= n - 1; i++) {
            if (n % i == 0) {
                return false;
            }
        }

        return true;
    }

public static void main(String[] args) {
    int n = 29;

    if (isPrime(n)) {
        System.out.println(n + " is a prime number.");
    } else {
        System.out.println(n + " is not a prime number.");
    }
}
}

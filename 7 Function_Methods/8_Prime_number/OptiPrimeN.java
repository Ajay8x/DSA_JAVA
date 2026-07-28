

public class OptiPrimeN {

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


public static void main(String[] args) {
    int n = 29; // Example number to check
    if (isPrime(n)) {
        System.out.println(n + " is a prime number.");
    } else {
        System.out.println(n + " is not a prime number.");
    }
    
}
}

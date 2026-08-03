import java.lang.Math;

/**
 * Dec_T0_Bin
 */
public class Dec_T0_Bin {

    public static void dec_to_bin(long n) {
        long power = 0;
        long binNumber = 0;

        while (n > 0) {
            long rem = n % 2;
            binNumber += rem * (long) Math.pow(10, power);
            n = n / 2;
            power++;
        }

        System.out.println("Binary Number = " + binNumber);
    }

    public static void main(String[] args) {
        dec_to_bin(7);
    }
}
package l6;

public class numberPyramid {
    public static void main(String[] args) {
        int n = 5;
        for (int i = 1; i <= n; i++) {
            // print space
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                // print number
                System.out.print("  " + i);
            }
            System.out.println();
        }
    }

}
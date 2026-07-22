package l5;

public class nestedLoop7 {
    public static void main(String[] srgs) {
        int n = 5;

        // outer loop
        for (int i = 1; i <= n; i++) {
            // inner loop space print
            for (int j = 1; j <= i; j++) {
                System.out.print(" " + j);
            }

            System.out.println();

        }

    }
}
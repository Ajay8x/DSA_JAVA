package l6;

public class solidRhombus {
    public static void main(String[] args) {
        int n = 5;
        int m = 5;

        // outer loop

        for (int i = 0; i < n; i++) {

            // inner loop // print space
            for (int s = 0; s < n - i - 1; s++)
                System.out.print(" ");

            // print stars
            for (int j = 0; j <= m; j++) {
                System.out.print("* ");

            }

            System.out.println();

        }

    }

}
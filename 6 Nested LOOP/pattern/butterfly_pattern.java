public class butterfly_pattern {
    public static void main(String[] args) {
        int n = 4;
        // outer loop Upper half
        for (int i = 1; i <= n; i++) {
            // inner loop
            // 1ts part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            // Spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // right 2sd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        // lower half
        for (int i = n; i >= 1; i--) {
            // inner loop left 1ts part
            for (int j = 1; j <= i; j++)
                System.out.print("*");
            // Spaces
            int space = 2 * (n - i);
            for (int j = 1; j <= space; j++) {
                System.out.print(" ");
            }
            // right 2sd part
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
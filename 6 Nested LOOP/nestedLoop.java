
public class nestedLoop {
    public static void main(String[] args) {
        int n = 5;

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                int sum = i + j;
                if (sum % 2 == 0) {// even
                    System.out.print("1 ");
                } else {
                    // odd
                    System.out.print("0 ");
                }
            }
            // Move to next line after printing one row
            System.out.println();
        }

    }
}

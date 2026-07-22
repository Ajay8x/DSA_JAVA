package l5;

public class nestedLoop1 {
    public static void main(String[] args) {
        int r = 4;  // rows
        int c = 5;  // columns

        // Outer loop for rows
        for (int i = 0; i < r; i++) {
            // Inner loop for columns
            for (int j = 0; j < c; j++) {
                System.out.print("* ");
            }
            // Move to next line after printing one row
            System.out.println();
        }
    }
}

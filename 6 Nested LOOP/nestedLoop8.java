package l5;

public class nestedLoop8 {
    public static void main(String[] args) {
        int n = 5;  // rows
        

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j<=n-i+1; j++) {
                System.out.print(j);
            }
            // Move to next line after printing one row
            System.out.println();
        }
    }
}
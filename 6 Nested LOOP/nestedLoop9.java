package l5;

public class nestedLoop9 {
    public static void main(String[] args) {
        int n = 5;  // rows
        int number=1;
        

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j<=i; j++) {
                System.out.print(number+"  ");
                number++;  // number=number+1
            }
            // Move to next line after printing one row
            System.out.println();
        }
    }
}
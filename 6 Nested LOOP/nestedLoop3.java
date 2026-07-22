package l5;

public class nestedLoop3 {



     public static void main(String[] args) {
        int r = 4;  // rows
       

        // Outer loop for rows
        for (int i = 1; i <= r; i++) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to next line after printing one row
            System.out.println();
        }
    }
}

    


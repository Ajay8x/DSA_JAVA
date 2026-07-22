package l5;


public class nestedLoop4 {



     public static void main(String[] args) {
        int r = 4;  // rows
       

        // Outer loop for rows
        for (int i = r; i >= 1; i--) {
            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            // Move to next line after printing one row
            System.out.println();
        }
    }
}

    


package l5;

public class nestedLoop2 {
    public static void main(String[] args) {
        int n = 4;  // rows
        int m = 5;  // columns

        // Outer loop for rows
        for (int i = 1; i <= n; i++) {
            // Inner loop for columns
            for (int j = 1; j <=m; j++) {

                //cell ->(i,j)
                if (i==1|| j==1 || i==n || j==m) {
                     System.out.print("*");
                }else{
                    System.err.print(" ");
                }
               
            }
            // Move to next line after printing one row
            System.out.println();
        }
    }
}
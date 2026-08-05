package PrintHollowRectangle;
public class PrintHollowRectangle {
    public static void Hollow_print(int total_rows, int total_columns) {
//outer loop for Total rows
        for (int i = 1; i <= total_rows; i++) {
            //inner loop for Total columns
            for (int j = 1; j <= total_columns; j++) {
                // checking if i and j is equal to 1 or total_rows and total_columns
                if (i == 1 || i == total_rows || j == 1 || j == total_columns) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // new line after each row
            System.out.println();
        }
    }


    public static void main(String[] args) {
        int total_rows = 11;
        int total_columns = 11;
        Hollow_print(total_rows, total_columns);
    }
}

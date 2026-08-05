public class Floyds_Tringle {

    public static void show(int total_rows) {

        int number = 1;

        // Outer loop for rows
        for (int i = 1; i <= total_rows; i++) {

            // Inner loop for columns
            for (int j = 1; j <= i; j++) {
                System.out.print(number + " ");
                number++; // number = number + 1
            }

            // Move to next line after printing one row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int total_rows = 6;
        show(total_rows);
    }
}
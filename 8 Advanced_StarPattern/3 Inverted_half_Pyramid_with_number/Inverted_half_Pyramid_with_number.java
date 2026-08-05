

public class Inverted_half_Pyramid_with_number {
    

public static void show(int total_rows) {
        //outer loop for Total rows
        for (int i = total_rows; i >= 1; i--) {
            //inner loop for Total columns
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            // new line after each row
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int total_rows = 6;
        show(total_rows);
    }



}

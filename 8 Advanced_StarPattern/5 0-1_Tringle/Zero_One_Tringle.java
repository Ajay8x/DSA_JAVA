

public class Zero_One_Tringle{


    public static void show(int total_rows) {
        //outer loop for Total rows
        for (int i = 1; i <= total_rows; i++) {
            //inner loop for Total columns
            for (int j = 1; j <= i; j++) {
                //even row and even column or odd row and odd column will have 1
                if ((i + j) % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
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

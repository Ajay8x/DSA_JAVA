

public class Hollow_Rhombus {
    
    public static void print_star(int n) {
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces print 
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }



            // stars loop
            for (int j = 1; j <= n; j++) {
                //hollow rhombus pattern logic
    //print only i=1 j=1 total_row=5 total_col=5
                if (i == 1 || i == n || j == 1 || j == n) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            // new line
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n = 5;
        print_star(n);
    }
}

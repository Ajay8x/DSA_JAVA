package l6;

public class palindromicPattern {
    public static void main(String[] args) {
        int n = 5;
        // outer loop
        for (int i = 1; i <= n; i++) {
            // spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // 1st half left number
            for (int j = i; j >= 1; j--) {
                System.out.print(j);

            }
            // 2st half right number
            for (int j = 2; j <= i; j++) {
                System.out.print(j);

            }
           System.out.println(); 
        }

    }
}

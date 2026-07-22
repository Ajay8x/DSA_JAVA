import java.util.Scanner;

public class for_loop {

    public static int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        int n = sum(a, b);

        System.out.println("sum = " + n);

  

        for (int i = 0; i < n; i++) {

            System.out.println("Alok Singh   " + "Dhansiriya Rajagarh Mirzapur");

        }
      sc.close();
    }
}

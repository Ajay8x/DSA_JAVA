

public class function_overLoding {

    // 2 int values
    public static int sum(int a, int b) {
        return a + b;
    }

    // 2 double values
    public static double sum(double a, double b) {
        return a + b;
    }

    // 3 int values
    public static int sum(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        System.out.println(sum(10, 20));
        System.out.println(sum(10, 20, 30));
        System.out.println(sum(10.5, 20.5));
    }
}
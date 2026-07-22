import java.util.Scanner;

public class simpleJava {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter your age, height, grade, and name: ");
        int age = sc.nextInt();
        float height = sc.nextFloat();
        char grade = sc.next().charAt(0);
        String name = sc.next();

        System.out.println("Your age: " + age);
        System.out.println("Your height: " + height);
        System.out.println("Your grade: " + grade);
        System.out.println("Your name: " + name);
    }
}
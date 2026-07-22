
// odd or even


package conditional;
import java.util.*;

public class if_else {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt(); 

        if (x % 2 == 0) {
            System.out.println("even");  
        } else {
            System.out.println("odd");
        }
    }
}
package l4.loop;
import java.util.*;
public class while_loop {

public static void main(String[] args) {
     Scanner sc = new Scanner(System.in);
int n=sc.nextInt();


     System.out.println("\n--- While Loop ---");
        int i = 0;
        long startWhile = System.nanoTime();


        
        while (i <= n) {
            System.out.println(";) " + i);
            i++;
        }





        long endWhile = System.nanoTime();
        double durationWhile = (endWhile - startWhile) / 1_000_000.0;
        System.out.println("Time taken by while loop: " + durationWhile + " ms");

}

}

// Class ka naam
public class StarPattern {

    // Main method, yahin se program start hota hai
    public static void main(String args[]) {
        // Total rows ki value
        int n = 4;

        // Outer loop rows ko control karta hai
        for (int i = 0; i <= n; i++) {

            // Inner loop har row me stars print karta hai
            for (int j = 0; j < i; j++) {
                // Ek star print karo, next line me nahi ja raha hai
                System.out.print("*");
            }
            // Current row complete hone ke baad next line me ja raha hai
            System.out.println();
        }
    }
}
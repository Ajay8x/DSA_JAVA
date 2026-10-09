public class pairsInArray {


 public static void printPairs(int numbers[]) {
        int n = numbers.length; // Get the length of the array

        // Iterate through the array to find pairs
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                // Print the pair of elements
                System.out.print("(" + numbers[i] + ", " + numbers[j] + ")");
            }
            System.out.println(); // Move to the next line after printing pairs for the current element    

        }
    }

    public static void main(String args[]) {
        int numbers[] = { 10, 20, 30, 40, 50 }; // Array to find pairs in

        System.out.println("Pairs in the array:");
        printPairs(numbers); // Call the method to print pairs
    }
    
}

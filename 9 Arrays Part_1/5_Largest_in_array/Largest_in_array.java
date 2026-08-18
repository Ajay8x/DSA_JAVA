
public class Largest_in_array {

    // method 1 to find the largest element in an array
    public static int largestInArray1(int NumArr[]) {
        int largest = NumArr[0]; // Assume the first element is the largest

        for (int i = 1; i < NumArr.length; i++) {
            if (NumArr[i] > largest) {
                largest = NumArr[i]; // Update largest if a larger element is found
            }
        }
        return largest; // Return the largest element found
    }

    // Method 2 to find the largest element in an array
    public static int largestInArray2(int NumArr[]) {
        int largest = Integer.MIN_VALUE; // Initialize to the smallest possible integer

        for (int i = 0; i < NumArr.length; i++) {
            if (NumArr[i] > largest) {
                largest = NumArr[i]; // Update largest if a larger element is found
            }
        }
        return largest; // Return the largest element found
    }

    public static void main(String args[]) {
        int number[] = { 10, 20, 30, 40, 5 };

        int largestElement = largestInArray1(number);
        System.out.println("The largest element in the array is: " + largestElement);

        int largestElement2 = largestInArray2(number);
        System.out.println("The largest element in the array is: " + largestElement2);

    }

}

import java.util.*;
// Reverse an array
public class reverseAnArray {
    // Method to reverse an array
    public static void reverseArray(int numbers[]) {
        int start = 0; // Initialize the left pointer
        int end = numbers.length - 1; // Initialize the right pointer

        while (start < end) {
            // Swap the elements at start and end indices
            int temp = numbers[start];
            numbers[start] = numbers[end];
            numbers[end] = temp;

            // Move the pointers towards the center
            start++;
            end--;
        }
    }

    public static void main(String args[]) {
        int numbers[] = { 10, 20, 30, 40, 50 }; // Array to be reversed

        System.out.println("Original array: " + Arrays.toString(numbers));
        reverseArray(numbers); // Call the method to reverse the array
        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}
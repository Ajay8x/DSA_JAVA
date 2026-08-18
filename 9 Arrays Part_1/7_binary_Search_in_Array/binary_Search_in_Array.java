public class binary_Search_in_Array {
    // Method to perform binary search in a sorted array
    public static int binarySearch(int numbers[], int key) {
        int start = 0; // Initialize the left pointer
        int end = numbers.length - 1; // Initialize the right pointer

        while (start <= end) {
            int mid = start + end / 2; // Calculate the middle index
            // Calculate the middle index method 2
            // int mid =start (start - end)/2; // Calculate the middle index

            // compare the middle element with the target key
            if (numbers[mid] == key) {
                return mid; // Target found at index mid
            } else if (numbers[mid] < key) {
                start = mid + 1; // Search in the right half
            } else {
                end = mid - 1; // Search in the left half
            }
        }
        return -1; // Target not found
    }
    public static void main(String args[]) {
        int numbers[] = { 10, 20, 30, 40, 50 }; // Sorted array for binary search
        int key = 30; // Element to search for
        int result = binarySearch(numbers, key);
        if (result == -1) {
            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + result);
        }
    }
}

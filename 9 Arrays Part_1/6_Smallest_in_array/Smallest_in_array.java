

public class Smallest_in_array {



    


    // method 1 to find the Smallest element in an array
    public static int SmallestInArray1(int NumArr[]) {
        int Smallest = NumArr[0]; // Assume the first element is the Smallest

        for (int i = 1; i < NumArr.length; i++) {
            if (NumArr[i] < Smallest) {
                Smallest = NumArr[i]; // Update Smallest if a larger element is found
            }
        }
        return Smallest; // Return the Smallest element found
    }



    
    // Method 2 to find the Smallest element in an array
    public static int SmallestInArray2(int NumArr[]) {
        int Smallest = Integer.MAX_VALUE; // Initialize to the smallest possible integer

        for (int i = 0; i < NumArr.length; i++) {
            if (NumArr[i] < Smallest) {
                Smallest = NumArr[i]; // Update Smallest if a larger element is found
            }
        }
        return Smallest; // Return the Smallest element found
    }

    public static void main(String args[]) {
        int number[] = { 101, 20, 30, 40, 50 };

        int SmallestElement = SmallestInArray1(number);
        System.out.println("The Smallest element in the array is: " + SmallestElement);
   
   
        int SmallestElement2 = SmallestInArray2(number);
        System.out.println("The Smallest element in the array is: " + SmallestElement2);  



    }

}



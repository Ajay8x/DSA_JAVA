import java.util.*;

public class liner_Search {

    public static int linearSearch(int NumArr[], int key) {
        for (int i = 0; i < NumArr.length; i++) {
            if (NumArr[i] == key) {
                return i; // Return the index of the key if found
            }
        }
        return -1; // Return -1 if the key is not found
    }

    public static void main(String args[]) {
        int number[] = { 10, 20, 30, 40, 50 };
        String menu[] = { "dosa", "chhole", "samosa", "puri", "jalebi", "idli", "vada", "poha", "pavbhaji", "pasta",
                "pizza", "burger", "sandwich", "biryani", "chicken", "mutton", "fish", "egg", "dal", "rice" };
        int key = 30;
        int index = linearSearch(number, key);

        if (index == -1) {

            System.out.println("Element not found in the array.");
        } else {
            System.out.println("Element found at index: " + index);

        }
    }
}

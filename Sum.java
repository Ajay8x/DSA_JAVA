import java.util.Scanner;
public class Sum {

    public static void main(String[] args) {


  // int arr[] = {2, 32, 7, 11, 15 };
           // int target = 9;


  Scanner sc = new Scanner(System.in);



 System.out.println("Enter size of arr[]");
   int n = sc.nextInt();

   int []arr=new int[n];

    System.out.println("Enter "+ n+" numbers");

    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();

    }

        System.out.println("your Enter element are");

        for(int i=0;i<n;i++){
               System.out.println(arr[i]+ " "); 
        }







System.out.println("enter your sum target :\n = ");
         int target  = sc.nextInt();


     n = arr.length;







        for (int i = 0; i < n; i++) {
            int first = arr[i];

            for (int j = i + 1; j < n; j++) {
                int second = arr[j];
                int sum = first + second;

                if (sum == target) {
                    System.out.println("Pair found: " + first + " + " + second + " = " + target);
                    System.out.println("Indices index: " + i+1 + ", " + j+1);
                    return;
                }

            }
        }

        System.out.println("No pair found");

    }
}

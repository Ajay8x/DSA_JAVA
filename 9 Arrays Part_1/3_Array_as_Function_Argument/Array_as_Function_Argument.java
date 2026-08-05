
public class Array_as_Function_Argument {
    
    public static void update(int marks[]){
        for(int i=0; i<marks.length; i++){
            marks[i] = marks[i] + 1; // Increase each mark by 5
        }
    }
    public static void main(String args[]){

        int marks[] = {90, 85, 78}; // Initial marks for 1 subjects
 
        update(marks); // Pass the array to the function
    

        // Output the updated marks
        for(int i=0; i<marks.length; i++){
           System.out.print(marks[i] + " ");
        }
        System.out.println();
       
    }

}

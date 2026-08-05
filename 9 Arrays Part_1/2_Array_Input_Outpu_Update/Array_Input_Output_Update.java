import java.util.Scanner;


 public class Array_Input_Output_Update {  

  public static void main(String[] args) { 

  Scanner sc = new Scanner(System.in);
//         // Input the size of the array
int marks[]=new int[100];
// Input marks for 4 subjects
 marks[0]= sc.nextInt();  //physics
 marks[1]= sc.nextInt();  //chemistry
 marks[2]= sc.nextInt();  //maths
 marks[3]= sc.nextInt();  //english
// Output the marks
System.out.println("Marks in Physics: " + marks[0]);
System.out.println("Marks in Chemistry: " + marks[1]);  
System.out.println("Marks in Maths: " + marks[2]);
System.out.println("Marks in English: " + marks[3]);



// Update marks for a subject
marks[2] = 95; // Update Maths marks to 95

System.out.println("Updated Marks in Maths: " + marks[2]);

int totalMarks = marks[0] + marks[1] + marks[2] + marks[3];
System.out.println("Total Marks: " + totalMarks);

int percentage = (totalMarks / 4);
System.out.println("Percentage: " + percentage + "%");

  }
}

















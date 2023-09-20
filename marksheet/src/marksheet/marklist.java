package marksheet;
import java.util.Scanner;
public class marklist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 Scanner input = new Scanner(System.in);
		  System.out.print("Enter the number of students: ");
	        int numStudents = input.nextInt();

	        System.out.print("Enter the number of subjects: ");
	        int numSubjects = input.nextInt();

	        // Create arrays to store student names and marks
	        String[] studentNames = new String[numStudents];
	        double[][] marks = new double[numStudents][numSubjects];

	        // Input student names and marks
	        for (int i = 0; i < numStudents; i++) {
	            input.nextLine(); // Consume the newline character
	            System.out.print("Enter student name for student " + (i + 1) + ": ");
	            studentNames[i] = input.nextLine();

	            for (int j = 0; j < numSubjects; j++) {
	                System.out.print("Enter marks for subject " + (j + 1) + ": ");
	                marks[i][j] = input.nextDouble();
	            }
	        }

	        // Calculate and display student totals and averages
	        System.out.println("\nStudent Marksheet");
	        System.out.println("---------------------------------------------------------");
	        System.out.printf("%-10s%-20s%-10s%-10s%-10s%-10s%-10s\n", "S.No", "Student Name", "Sub1", "Sub2", "Sub3", "Sub4", "Sub5");

	        for (int i = 0; i < numStudents; i++) {
	            double total = 0;
	            System.out.printf("%-10d%-20s", (i + 1), studentNames[i]);

	            for (int j = 0; j < numSubjects; j++) {
	                System.out.printf("%-10.2f", marks[i][j]);
	                total += marks[i][j];
	            }

	            double average = total / numSubjects;
	            System.out.printf("%-10.2f\n", total);
	            System.out.println("Average: " + average);
	        }

	        // Calculate and display unit averages
	        System.out.println("\nUnit Averages:");
	        for (int j = 0; j < numSubjects; j++) {
	            double unitTotal = 0;

	            for (int i = 0; i < numStudents; i++) {
	                unitTotal += marks[i][j];
	            }

	            double unitAverage = unitTotal / numStudents;
	            System.out.println("Subject " + (j + 1) + " Average: " + unitAverage);
	        }
	       
	}

}

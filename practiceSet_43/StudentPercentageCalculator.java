
import java.util.Scanner;

public class StudentPercentageCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the number of subjects
        System.out.print("Enter the number of subjects: ");
        int numSubjects = scanner.nextInt();

        // Create an array to store the marks obtained in each subject
        double[] marks = new double[numSubjects];

        // Initialize a variable to store the total marks obtained
        double totalMarksObtained = 0;

        // Get the marks for each subject
        for (int i = 0; i < numSubjects; i++) {
            System.out.print("Enter the marks obtained in subject " + (i + 1) + ": ");
            marks[i] = scanner.nextDouble();
            totalMarksObtained += marks[i];
        }

        // Prompt the user to enter the maximum marks for each subject
        System.out.print("Enter the maximum marks for each subject: ");
        double maxMarksPerSubject = scanner.nextDouble();

        // Calculate the total maximum marks
        double totalMaxMarks = maxMarksPerSubject * numSubjects;

        // Calculate the percentage
        double percentage = (totalMarksObtained / totalMaxMarks) * 100;

        // Display the results
        System.out.println("The total marks obtained: " + totalMarksObtained + " out of " + totalMaxMarks);
        System.out.println("The percentage of marks obtained: " + percentage + "%");

        scanner.close();
    }
}

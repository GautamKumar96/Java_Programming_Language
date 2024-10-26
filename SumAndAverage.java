import java.util.Scanner;

public class SumAndAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input the three marks
        System.out.print("Enter the first mark: ");
        int mark1 = scanner.nextInt();

        System.out.print("Enter the second mark: ");
        int mark2 = scanner.nextInt();

        System.out.print("Enter the third mark: ");
        int mark3 = scanner.nextInt();

        
        int sum = mark1 + mark2 + mark3;

        double average = sum / 3.0;

        System.out.println("Sum of the marks: " + sum);
        System.out.println("Average of the marks: " + average);

        scanner.close();
    }
}

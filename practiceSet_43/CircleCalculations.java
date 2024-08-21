import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input radius
        System.out.print("Enter the radius of the circle: ");
        double radius = scanner.nextDouble();

        // Calculate area of the circle
        double area = Math.PI * Math.pow(radius, 2);

        // Display the area
        System.out.println("Area of the circle is: " + area);

        // Input height for cylinder volume calculation
        System.out.print("Enter the height of the cylinder: ");
        double height = scanner.nextDouble();

        // Calculate volume of the cylinder
        double volume = area * height;

        // Display the volume
        System.out.println("Volume of the cylinder is: " + volume);

        scanner.close();
    }
}

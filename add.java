import java.util.Scanner;

public class add {

  public static void main(String[] args) {
    // int a, b, sum;
    Scanner scan = new Scanner(System.in);
    System.out.println("Take input form  the user:");
    System.out.println("Enter the frist number");
    int a = scan.nextInt();
    System.out.println("Enter the second number");
    int b = scan.nextInt();
    int sum = a + b;
    System.out.println("sum of two number: is");
    System.out.println(sum);

  }

}

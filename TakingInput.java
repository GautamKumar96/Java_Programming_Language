import java.util.Scanner;

public class TakingInput {
  public static void main(String[] args)


  {
    System.out.println("TakingInput from user!");

    Scanner sc = new Scanner(System.in);
    System.out.println("Enter number 1");
    int a = sc.nextInt();
    System.out.println("Enter number 2");
    int b = sc.nextInt();
    int sum = a + b;
    System.out.println(sum);
  }
}

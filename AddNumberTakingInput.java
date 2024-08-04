import java.util.Scanner;
public class AddNumberTakingInput {
  public static void main(String []args){
    System.out.println("Enter your number");
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your frist number is:");
    int a = sc.nextInt();
     System.out.println("Enter your second number is:");
     int b = sc.nextInt();
     int sum = a+b;
     System.out.println("sum of these number is:");
     System.out.println(sum);
  }
}

import java.util.Scanner;

public class calculator {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter your first number:");
    int a = sc.nextInt();
    System.out.println("Enter your second number:");
    int b = sc.nextInt();
    System.out.println("Enter your  operator:");
    char ch = sc.next().charAt(0);
    switch (ch) {

      case '+':
        System.out.println(a + b);
        break;
      case '-':
        System.out.println(a - b);
        break;
      case '*':
        System.out.println(a * b);
        break;
      case '/':
        System.out.println(a / b);
        break;
      case '%':
        System.out.println(a % b);
        break;
      default:
        System.out.println("Wrong answer");
    }
  }
}

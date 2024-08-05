import java.util.Scanner;
public class Calculator {
  public static void main(String []args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter your frist number:");
    int a = sc.nextInt();
    
    System.out.println("Enter your second number:");
    int b = sc.nextInt();

    System.out.println("Enter your operator (+,-,*,/):");
    char ch = sc.next().charAt(0);

    switch (ch){
      case '+':
      System.out.println("Result:"+(a+b));
      break;
      case '-':
      System.out.println("Result:"+(a-b));
      break;
      case '*':
      System.out.println("Result:"+(a*b));
      break;
      case '/':
      if(b!=0){
       System.out.println("Result"+(a-b));
      }
      else{
        System.out.println("Error Division by zero is not allowed.");
      }
      break;
      default:
      System.out.println("Wrong operator");
    }
  }
}

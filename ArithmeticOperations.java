import java.util.Scanner;
public class  ArithmeticOperations{
  public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter num1");
      int num1 = sc.nextInt();
      System.out.println("Enter num2");
      int num2  = sc.nextInt();
       
      int  sum = num1+num2;
      int difference = num1 - num2;
      int product = num1*num2;
      int quotient =  num1/num2;
      int remainder = num1%num2;

      System.out.println("sum :"+sum);
      System.out.println("difference :"+difference);
      System.out.println("product :"+product);
      System.out.println("quotient :"+quotient);
      System.out.println("remainder :"+remainder);
  }
}

import java.util.Scanner;
public class WithoutUsingOperators_2 {
  public static void main(String[]args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter an integer");
    int num = sc.nextInt();
    int result = (num<<3);
    System.out.println(result);
  }
}

import java.util.Scanner;
public class UserTakeOddNum {
  public static void main(String[] args){
    System.out.println("print number");
    Scanner sc = new Scanner(System.in);

   double number = sc.nextDouble();
   if(number % 2==0){
   System.out.println("this is the Even number");
   }

 else{
  System.out.println("this is the Odd number");
 }

  }

}
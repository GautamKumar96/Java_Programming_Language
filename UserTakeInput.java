
import java.util.Scanner;
public class UserTakeInput {
  public static void main(String[] args){
     Scanner sc = new Scanner(System.in);
     System.out.println("Enter the value");
     int num = sc.nextInt();
      if(num%2==0){
        System.out.println("even number");
      }
      else{
        System.out.println("odd number");
      }
  }
}

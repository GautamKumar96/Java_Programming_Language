import java.util.Scanner;
public class vote {
  public static void main(String[] args){
   Scanner sc = new Scanner(System.in);
   System.out.println("Enter your age");
   int age = sc.nextInt();
   if(age>=18){
   System.out.println("your can vote");
   }
  else {
    System.out.println("you can't vote");
   }
  }
}

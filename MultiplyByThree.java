import java.util.Scanner;
public class  MultiplyByThree{
  public static void main(String[]args){
    Scanner sc = new Scanner (System.in);
    System.out.println("Enter an integer");
    int num  = sc.nextInt();
    int result =  (num<<1)+num;//it's means multiply by 2 times

    System.out.println(result);
  }
}
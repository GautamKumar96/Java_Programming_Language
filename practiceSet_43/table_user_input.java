import java.util.Scanner;
public class table_user_input {
  static void multi(int n){
    for(int i=1; i<=10; i++){
      System.out.format("%d*%d=%d\n",n,i,n*i);
    }
  }
  public static  void main(String []args){
  Scanner sc = new Scanner(System.in);
  System.out.println("Enter a number to print its multiplicatin of table:");
  int number = sc.nextInt();
  multi(number);
  }
}

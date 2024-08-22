import java.util.Scanner;
public class ToyPurchase_2 {
  public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter  the amount:");
    int amount =  sc.nextInt();
    int ToyCost = 100;
    if(amount >=ToyCost){
      System.out.println("you can buy a toy ");
    }
    else {
      System.out.println("you can't buy a toy");
    }
  }
}

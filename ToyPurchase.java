
import java.util.Scanner;

public class ToyPurchase {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the amount of money you have: ");
        double money = scanner.nextDouble();

    
        double toyCost = 40.0;

        
        if (money > toyCost) {
            System.out.println("You have enough money to buy the toy.");
        } else {
            System.out.println("You do not have enough money to buy the toy.");
        }

        scanner.close();
    }
}

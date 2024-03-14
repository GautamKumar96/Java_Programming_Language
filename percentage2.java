
import java.util.Scanner;

public class percentage2 {
  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("Enter marks of hindi");
    int hindi = scan.nextInt();
    System.out.println("Enter marks of math");
    int math = scan.nextInt();
    System.out.println("Enter marks of bio");
    int bio = scan.nextInt();
    System.out.println("Enter marks of che");
    int che = scan.nextInt();
    System.out.println("Enter marks of physics");
    int physics = scan.nextInt();
    int percentage = (hindi + math + bio + che + physics) / 5;
    // System.out.println("percentage");
    System.out.println(percentage);

  }

}

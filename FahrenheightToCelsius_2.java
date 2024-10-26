import java.util.Scanner;
public class FahrenheightToCelsius_2 {
   public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    
    System.out.println("Enter the temprature fahreheight");
    double fahreheight = sc.nextDouble();
    
    double celsius = (fahreheight-32)*5/9;

    System.out.println(celsius);
   }
}

import java.util.Scanner;
public class percentage {
 public static void main (String [] args){
  System.out.println("Enter your marks:");
  Scanner sc =  new Scanner(System.in);
  System.out.println("Enter your physics marks:"); 
  int physics = sc.nextInt();
  System.out.println("Enter your english marks:");
  int english = sc.nextInt();
  System.out.println("Enter your math marks:");
  int math = sc.nextInt();
  System.out.println("Enter your hindi marks:");
  int hindi = sc.nextInt();
  System.out.println("Enter your chemistry:");
  int chemistry = sc.nextInt();
  float percentage = ((physics+ english+math+hindi+chemistry)/500.0F)*100;
  System.out.println("percentage");
  System.out.println(percentage);
 } 
}

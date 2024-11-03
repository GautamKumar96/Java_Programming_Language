import java.util.Scanner;
public class BooleanLogicalOperators_2 {
  public static void main(String []args){
    Scanner sc = new Scanner(System.in);
    System.out.println("ente frist boolean value+(true/false):");
    boolean bool1 = sc.nextBoolean();
    System.out.println("enter second boolean value+(true/false):");
    boolean bool2 = sc.nextBoolean();
   
     System.out.println("bool1&&bool2:"+(bool1&&bool2));
     System.out.println("bool1||bool2:"+(bool1||bool2));
     System.out.println("!bool1:"+(!bool1));
     System.out.println("!bool2:"+(!bool2));
  }
}

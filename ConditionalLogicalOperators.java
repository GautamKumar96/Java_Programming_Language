public class ConditionalLogicalOperators {
  public static void main(String[]args){
    boolean condition1 = 4>7;
    boolean condition2 = 10>5;

    System.out.println("condition1 && condition2:"+(condition1&&condition2));

    System.out.println("condition1||condition2:"+(condition1||condition2));

    System.out.println("!condition1:"+(!condition1));

    System.out.println("!condition2:"+(!condition2));
  }
}

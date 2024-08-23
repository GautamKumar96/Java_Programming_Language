class A{
public int A;

public  int gautam(){
  return A;
}
public void math2(){
  System.out.println(" i am  method 2 class of A");
}
}
class B extends A{
  public void math3(){
  System.out.println("i am  method  3 class of B");
}
}
public class method_overriding_2 {
  public static void main(String []args){
      A a = new A();
      a.math2();
  }
}

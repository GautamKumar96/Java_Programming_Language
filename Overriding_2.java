class A{
  public int a;
  public int b;

public int Gm(){
  return 5;
}
public void math1(){
  System.out.println("i am math1 of class B");
}
}
class B extends A{
  public void math1(){
  System.out.println("i am math1 of class B");
  }
  public void math2(){
  System.out.println("i am math2 of class A");
}
 public  void main() {
  System.out.println("i am  math2 of class A");
 }
}
public class Overriding_2 {
  public static void main(String [] args){
    System.out.println("this is an overriding program");
    A a = new A();
    a.math1();
    B b = new B();
    b.math2();
  }
}

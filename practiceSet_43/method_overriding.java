class A{
  public int A;

   public int hary(){
    return 4;
   }
   public void math2(){
    System.out.println("i am method 2 class of A");
   }
}
class B extends A{
  public void math3(){
    System.out.println("i am method 3 class of B");
  }
}
public class method_overriding {
  public static void main(String []args){
      B a = new B();
      a.math2();
    
  }
}

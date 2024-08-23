import javax.management.monitor.GaugeMonitorMBean;

class A{
 public int A;

 public int Gautam(){
  return A;
 }
 public void math2(){
   System.out.println("I am a method  2 of class A");
 }
}
 class B extends A{
  public void math3(){
  System.out.println("I am a method 3 of class B");
}
 }
public class method_overriding_3 {
  public static void main(String[]args){
    A g = new A();
      
     g.math2();

  }
}

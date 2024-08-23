class Base1{
  Base1(){
  System.out.println("i am a construters");
}
Base1(int x){
  System.out.println("i am a overloaded constructer with value of x as:"+ x);
}
}
class Derived1 extends Base1{
 Derived1(){
  System.out.println("i am a derived class constructer:");
 }

}
Derived1(int x , int y){
  System.out.println("i am a overloaded constructer of derived  with value of y as:"+y);
}
public class constructer_overLoading {
  public static void main(String[] args) {
     Derived1 a = new Derived1(  14,  30);
  }
}

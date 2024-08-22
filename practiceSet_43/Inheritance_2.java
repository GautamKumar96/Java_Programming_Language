class Base{
  int a;
  public int getA(){
    return a;
  }
  public void setA(int a){
    this.a = a;
  }
}
  class Derived extends Base{
    int b;
    public int getB(){
      return b;
    }
    public void setB(int b){
      this.b = b;
    }
  }

public class Inheritance_2 {
  public static void main(String [] args){
    Base m = new Base();
      m.setA(5);
      System.out.println(m.getA());
      Derived n = new Derived();
        n.setB(6);
        System.out.println(n.getB());
      }
    }

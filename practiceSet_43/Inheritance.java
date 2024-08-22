class Base{
  int x;

  public int getX(){
    return x;
  }
  public void setX(int x){
    this.x = x;
  }
public void printMe(){
  System.out.println("i am in a Base class and set x value");
}
}
class Derived extends Base{
  int y;
  public int getY(){
    return y;
  }
  public void setY(int y){
    this.y = y;
  }
}


public class Inheritance {
  public static void main(String [] args){
    Base b = new Base();
    b.setX(9);
    System.out.println(b.getX());
    Derived d = new Derived();
    d.setY(10);
    System.out.println(d.getY());

  }
  
}

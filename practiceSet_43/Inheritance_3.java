class Base{
  int x;
  public int getX(){
    return x;
  }
  public void setX(int x){
    this.x= x;
  }
}
class Derived extends Base{
  int y;

  public int getY(){
    return  y;
  }
   public void setY(int y){
    this.y = y;
   }
}
public class Inheritance_3 {
  public static void main(String [] args){
   Base obj = new Base();
   obj.setX(12);
   System.out.println(obj.getX());
   Derived obj2 = new Derived();
   obj2.setY(24);
   System.out.println(obj2.getY());

  }
}

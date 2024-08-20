class cylinder_1{
 private int  radius;
 private int height;

 public int getradius(){
  return radius;
 }
 public void getradius(int radius){
  this.radius = radius;
 }
 public int getheight(){
  return height;
 }
 public void setheight(int height){
  this.height = height;
 }
}
public class cylinder{
  public static void main(String [] args){
    cylinder cylinder_1 = new cylinder();
    cylinder_1.setradius(12);
    cylinder_1.SetHeight(7);
    int r = cylinder_1.getradius();
    int  h = cylinder_1.getheight();
    System.out.println(r);
    System.out.println(h);
  }

}
class cylinder{
  double radius;
   double height;
   cylinder(double radius, double height){
    this.radius = radius;
    this.height = height;
   }
   double area(){
    return  2*Math.PI*radius*(radius+height);
   }
   double volume(){
    return Math.PI*radius*radius*height;
  }
}
public class cylinder_3 {
  public static void main(String []args){
  cylinder cy = new cylinder(2,4);
  double area  = cy.area();
  System.out.println(area);
  double volume =cy.volume();
  System.out.println(volume);
  }
}

class myCylinder{
  private  int radius;
  private  int height;
  public double area;
  public double volume;

  public  void SetRadius(int radius){
    this.radius = radius;
  }
  public  int getradius(){
     return radius;
  }
  public void SetHeight(int height){
    this.height = height;
  }
  public int getheight(){
    return height;
  }

  public void setArea(double area){
    this.area =area;
  }
  public double getArea (){
    return area;
  }

  public void setVolume(double volume){
    this.volume = volume;
  }
  public double  getVolume(){
  return volume;
}
  
}
public class cylinder_2 {
  public static void main(String [] args){
   myCylinder cylinder = new myCylinder();
   cylinder.SetRadius(12);
   System.out.println("radius:  "+cylinder.getradius());
  cylinder.SetHeight(7);
   System.out.println("heigh:  "+cylinder.getheight());
    
   double area = 2*Math.PI*cylinder.getradius()*(cylinder.getradius()+cylinder.getheight());
   double volume = Math.PI*cylinder.getradius()*cylinder.getradius();
   System.out.println(area);
   System.out.println(volume);
  } 
}

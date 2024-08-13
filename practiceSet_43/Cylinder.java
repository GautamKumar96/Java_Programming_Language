import java.util.Scanner;

public class Cylinder {

  public static double SurfaceArea(double radius,double height){
    //double SurFaceArea = 2*Math.PI*Math.pow(radius,2);
    double SurFaceArea = 2*Math.PI*radius*(radius+height);
     return SurFaceArea;
  }

  public static double Volume(double radius, double height){
    double Volume = Math.PI*Math.pow(radius,2)*height;
    return Volume;
  }

  public static void main(String [] args){
   Scanner sc = new Scanner (System.in);
  
   System.out.println("Enter the radiud of Cylinder");
   double radius = sc.nextDouble();

   System.out.println("Enter the height of Cylinder");
   double height = sc.nextDouble();

   double SurFaceArea = SurfaceArea(radius,height);
   double Volume = Volume(radius,height);
   System.out.println(SurFaceArea);
   System.out.println(Volume);
  }
}

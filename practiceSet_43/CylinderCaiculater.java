import java.util.Scanner;
public class CylinderCaiculater{


public static double calculateSurfaceArea(double radius, double height){

double baseArea = 2*Math.PI*Math.pow(radius,2);
double leteralSurfaceArea = 2*Math.PI*radius*height; 
return baseArea+leteralSurfaceArea;
}

public static double calculateValume(double radius, double height){
  return Math.PI*Math.pow(radius ,2)*height;
}

  public static void main(String []args){
 Scanner sc = new Scanner(System.in);
 System.out.println("Enter the radius of the cylinder:");
 double radius = sc.nextDouble();
 

 System.out.println("Enter the height of the cylinder:");
 double height = sc.nextDouble();
 double surfaceArea = calculateSurfaceArea(radius,height);
 double volume = calculateValume(radius,height);


 System.out.println("Surface Area of the cylinder:"+surfaceArea);
 System.out.println("volume of the Cylinder:"+volume);

  }
}
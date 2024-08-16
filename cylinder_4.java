class Cylinder {
  double radius;
  double height;

  // Constructor to initialize radius and height
  Cylinder(double radius, double height) {
      this.radius = radius;
      this.height = height;
  }

  // Method to calculate the surface area of the cylinder
  double calculateSurfaceArea() {
      return 2 * Math.PI * radius * (radius + height);
  }

  // Method to calculate the volume of the cylinder
  double calculateVolume() {
      return Math.PI * radius * radius * height;
  }
}
public class cylinder_4 {
  public static void main(String[] args) {
      // Create an instance of Cylinder
      Cylinder cyl = new Cylinder(3.0, 7.0);
      
      // Calculate and display the surface area
      double surfaceArea = cyl.calculateSurfaceArea();
      System.out.println("Surface area of the cylinder: " + surfaceArea);
      
      // Calculate and display the volume
      double volume = cyl.calculateVolume();
      System.out.println("Volume of the cylinder: " + volume);
  }
}
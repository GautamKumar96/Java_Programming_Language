
class Car {
  String model;
  int year;

  // Override toString() to print object details
//  @Override
 //public String String  (){
  //return "Model:"+model+ "Year"+ year;
  //public  void main(String []args){
   //System.out.println("Model:"+model+"Year:"+year);
 }

  


// Main class
public class moter {
  public static void main(String[] args) {
      Car myCar = new Car();  // Create an object of Car

      myCar.model = "TOYOTA"; // Set model
      myCar.year = 2025;      // Set year

      //System.out.println(myCar); // This will now print meaningful details
      System.out.println("Model:"+myCar.model);
      System.out.println("Year:"+myCar.year);
     //System.out.println(myCar);
  }
}


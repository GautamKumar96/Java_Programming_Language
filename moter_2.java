class Car{
  String model;
  int year;
}
public class moter_2 {
  public static void main(String [] args){
    Car myCar = new Car();
    myCar.model = "Hodai";
    myCar.year = 2025;
    System.out.println("Model:"+myCar.model);
    System.out.println("Year:"+myCar.year);
  }
}

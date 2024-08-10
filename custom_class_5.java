class Employee {  
  int id;
  int salary;
  String name;
  
  public void printDetails() {
    System.out.println("My id is: " + id);
    System.out.println("My name is: " + name);
    System.out.println("And my salary is: " + salary);
  }
}

public class custom_class_5 {
  public static void main(String[] args) {
    Employee gautam = new Employee();
    gautam.id = 17; 
    gautam.salary = 500000;
    gautam.name = "Gautam Kumar";
    gautam.printDetails();
  }
}

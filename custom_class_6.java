class custom{
  int id ;
  int salary;
  String name;

  public void printDetails(){
    System.out.println("this is my id:"+id);
    System.out.println("thsi is our salary:"+ salary);
    System.out.println("my name is"+name);
  }
}
public class custom_class_6 {
  public static void  main(String []  arga ){
     Employee gautam = new Employee();
     gautam.id = 17;
     gautam.salary = 500000;
     gautam.name  = "Gaurav kumsr";
     gautam.printDetails();
  }
}

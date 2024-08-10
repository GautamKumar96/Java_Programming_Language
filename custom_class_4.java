class Employee{
  int id;
  String name;
  public int salary;
  public void  printlnDetail(){
    System.out.println("my id is "+ id);
    System.out.println("and my name is"+name);
  }
}
public class custom_class_4 {
  public static void main(String[] args){
    System.out.println("this is our custom class");
    Employee harry = new Employee();
    harry.id =5017;
    harry.name =" Gautam kumar";
  //  System.out.println(harry.id);
    // System.out.println(harry.name);
    harry.printlnDetail();
  }
  
}

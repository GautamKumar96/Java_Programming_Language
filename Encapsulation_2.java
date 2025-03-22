class boy{
  String boy;
  int salary;
  int id;
  public void main(String [] args){
    System.out.println("Employee id:"+id+"Employee name:"+boy+"Employee salary:"+500000);
  }
}
public class Encapsulation_2 {
   public static void main (String []args){
      boy b = new boy();
      b.boy = "Gautam Kumar";
      b.salary = 500000;
      b.id = 17;
      System.out.println("Emloyee id:"+b.id);
      System.out.println("Emloyee name:"+b.boy);
      System.out.println("Employee salary:"+b.salary);
   }
}

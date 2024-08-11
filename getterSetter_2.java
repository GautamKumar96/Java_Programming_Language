class MyEmployee_1{
  private int id;
  private String name;
  private int salary;

  public void  setId( int i){
    id =i;
  }
  public int getId(){
    return id;
  }
  public void setName(String n){
    name = n;
  }
  public String getName(){
    return name;
  }
  public void setsalary( int s){
    salary = s;
  }
  public int getsalary(){
    return salary;
  }
}
public class getterSetter_2 {
  public static void main(String[] args){
  MyEmployee_1 gautam = new MyEmployee_1();
  gautam.setId(17);
  System.out.println(gautam.getId());
  gautam.setName("gautam kumar");
  System.out.println(gautam.getName());
  gautam.setsalary(500000);
  System.out.println(gautam.getsalary());
  }
}

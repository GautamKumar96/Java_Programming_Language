 class man{
  String name;
  int salary;
  String Village;
  public void main(String []args){
    System.out.println("name:"+name+"salary:"+5000000+"village:"+Village);
  }
 }
public class Encapsulation_3 {
  public static void main(String []args){
    man m = new man();
    m.name = "Aman Kumar";
    m.salary = 550000;
    m.Village = "Bhim Bigha";
    
    System.out.println("name:"+ m.name + "salary:"+ m.salary + "village:" + m.Village);
  }
}

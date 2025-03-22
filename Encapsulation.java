class person {
private String name ;
 public void setName(String newName){
  name = newName;
}
public String getName(){
 return name;
}
}

public class Encapsulation {
  public static void main(String []args){
    person p1 = new person ();
    p1.setName("Gautam Kumar");
    System.out.println("person's name:"+ p1.getName());
  }
}

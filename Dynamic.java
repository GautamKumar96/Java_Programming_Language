class phone{
  public void great(){
    System.out.println("Good morning");
  }
  public void name(){
    System.out.println("my name is java");
  }
}
class smartphone extends phone{
  public void swagat(){
    System.out.println("Aap kd swagat hai");
  }
  public void name(){
    System.out.println("my name is java in class two");
  }
}
public class Dynamic{
  public static void main(String []ars){
    System.out.println("this is a dynamic mathod");
   phone obj = new phone();
   obj.name();
   smartphone obj_1 = new smartphone();
   obj_1.name();

  }
}
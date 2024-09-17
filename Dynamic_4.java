class phone {
  public void great(){
    System.out.println("Radhe Radhe");
  }
    public void name(){
      System.out.println("My name is Gautam kumar");
    }
  }
  class smartphone extends phone {
    public void swagat(){
    System.out.println("Aap ka swagat");
  }
  public void name(){
    System.out.println("My name is Gautam kumar it department");

    }
  }
public class Dynamic_4 {
  public static void main(String [] args){
   phone obj = new smartphone();
   obj.great();
   smartphone obj2 = new smartphone();
   obj2.swagat();
  }
}

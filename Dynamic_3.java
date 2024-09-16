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
public class Dynamic_3 {
  public static void main(String [] args){
    phone line = new phone();
    line.name();
    phone line2 = new smartphone(); 
    line2.great();
    smartphone line3 =   new  smartphone ();
    line3.swagat();
    smartphone line4 =   new  smartphone ();
      line4.name();
  }
}

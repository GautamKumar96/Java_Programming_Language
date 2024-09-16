class One{
  public void gaurav(){
    System.out.println("my name is Gautam kumar");
  }
}
class Two extends One{
  public void gautam (){
    System.out.println("my name is Gautam kumar from bihar");
  }

}
public class Dynamic_2 {
  public static void main(String[]args){
 One a = new One();
  a.gaurav();
  Two b = new Two();
  b.gautam();
  }
}

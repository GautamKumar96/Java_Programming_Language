 class Phone{
  public void Showtime(){
    System.out.println("Time is 8 am");
  }
  public void on (){
    System.out.println(" Turring on the phone");
  }
}
class Smartphone extends Phone{
 public void music(){
  System.out.println("playing music");
 }
 public void hindi(){
System.out.println(" hindi gana chalayo");
}
}
public class Dynamic_5 {
 public static void main(String[]args){
   Phone obj = new Smartphone();
   obj.Showtime();
   obj.on();
   Smartphone obj2 = new Smartphone();
   obj2.music();
   obj2.hindi();
  }
}

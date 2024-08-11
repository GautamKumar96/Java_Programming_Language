class Mukesh{
  public void hit(){
    System.out.println("Hitting enemy");
  }
  public void run(){
     System.out.println("Runnig..");
  }
  public void fire(){
    System.out.println("firing on the enemy");
  }
}
public class game{
  public static void main(String [] args){
    Mukesh mk = new Mukesh();
    mk.hit();
    mk.run();
    mk.fire();
  }
}
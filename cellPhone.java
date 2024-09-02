
class custom {
  public void ringing() {
    System.out.println("Ringing...");
  }

  public void vibrating() {
    System.out.println("Vibrating...");
  }

  public void callFriend() {
    System.out.println("calling Ujjwal");
  }
}

public class cellPhone {
  public static void main(String[] args) {
    custom iphone = new custom();
    iphone.ringing();
    iphone.vibrating();
    iphone.callFriend();

  }
}

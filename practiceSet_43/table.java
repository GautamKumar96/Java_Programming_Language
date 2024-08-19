public class table {
  static void multi(int n){
    for(int i=1; i<=10; i++){
      System.out.format("%d*%d=%d\n",n,i,n*i);
    }
  }
  public static void main(String []args){
   multi(10);
  }
}

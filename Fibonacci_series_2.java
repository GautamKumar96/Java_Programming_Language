public class Fibonacci_series_2 {
  static  int  Fibonacci(int n){
    if(n==1|| n==2){
      return n-1;
   }
   // else if(n==2){
    //  return 1;
   // }
    else{
      return Fibonacci(n-1)+Fibonacci(n-2);
    }
  }
  public  static void main(String[] args){
    int c = Fibonacci(5);
    System.out.println(c);
  }
}

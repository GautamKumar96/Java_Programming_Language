public class Fibonacci_series {
  static int Fibonacci(int n){
    if(n==1){
      return 0;
    }
    else if(n==2){
      return 1;
    }
    else{
      return Fibonacci(n-1)+ Fibonacci(n-2);
    }
  }
  public static void main(String [] args){
    int result = Fibonacci(5);
    System.out.println(result);
  }
}

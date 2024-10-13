public class factorial_4 {
  static int factorial(int n){
   if(n==0||n==1){
    return 1;
   }
   else{
    return n*factorial(n-1);
   }
  }
  public static void main(String [] args){
   int n = 14;
    System.out.println("factorial value of n number is:");
    System.out.println(factorial(n));
  }
}

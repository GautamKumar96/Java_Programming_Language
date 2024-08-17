public class varargs_bodmas_1 {

  static int bodmas(int a, int b, int c, int d, int e){
    return a+b*(c+d)/e;
  }
  public static void main(String[] args){
   System.out.println(bodmas(2,4,4,2,2));
  }
}

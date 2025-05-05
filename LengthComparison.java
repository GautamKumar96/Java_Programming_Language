 public class LengthComparison {
  public static void main(String[] args) {
      String str1 = "Hello";
      String str2 = "World!";

      if (str1.length() > str2.length()) {
          System.out.println("str1 is longer");
      } else if (str1.length() < str2.length()) {
          System.out.println("str2 is longer");
      } else {
          System.out.println("Both strings are of equal length");
      }
  }
}


import java.util.Arrays; // Importing the built-in Arrays utility

public class Arrays__1 { // Changed class name to avoid conflict
  public static void main(String[] args) {
    String[] fruits = { "apple", "banana", "guava" };
    System.out.println(Arrays.toString(fruits)); // Now correctly refers to java.util.Arrays
  }
}

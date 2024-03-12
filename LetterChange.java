public class LetterChange {
  public static void main(String[] args) {
    String Letter = "drear <|name|>,thanks a lot";
    Letter = Letter.replace("<|name|>", " Lakshman");
    System.out.println(Letter);
  }
}
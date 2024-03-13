public class LetterChange {
  public static void main(String[] args) {
    String Letter = "dear <|name|>,thanks a lot";
    Letter = Letter.replace("<|name|>", " Lakshman");
    System.out.println(Letter);
  }
}

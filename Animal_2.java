class Animal {
  String name;


  Animal(String name) {
      this.name = name;
  }

 
  void makeSound() {
      System.out.println("Generic animal sound");
  }

 
  void display() {
      System.out.println("This is the animal named: " + name);
  }
}


class Monkey extends Animal {


  Monkey(String name) {
      super(name); 
  }

  @Override
  void makeSound() {
      System.out.println("Khee Khee");
  }
}


public class Animal_2 {
  public static void main(String[] args) {
      Monkey myMonkey = new Monkey("Babdar");

      myMonkey.display();


      myMonkey.makeSound();
  }
}

class Animal {
  String name;

  // Constructor for the Animal class
  Animal(String name) {
      this.name = name;
  }

  // Method to make a generic animal sound
  void makeSound() {
      System.out.println("Generic animal sound");
  }

  // Method to display the name of the animal
  void display() {
      System.out.println("This is the animal name: " + name);
  }
}

// The monkey class extends Animal
class Monkey extends Animal {

  // Constructor for the Monkey class
  Monkey(String name) {
      super(name); // Call the parent class (Animal) constructor
  }

  // Override the makeSound method
  @Override
  void makeSound() {
      System.out.println("Khee Khee");
  }
}

// Main class to test the inheritance
public class Animal_2 {
  public static void main(String[] args) {
      // Creating an object of the Monkey class
      Monkey myMonkey = new Monkey("Bandar");

      // Calling the display method of the base class
      myMonkey.display();

      // Calling the overridden makeSound method of the derived class
      myMonkey.makeSound();
  }
}

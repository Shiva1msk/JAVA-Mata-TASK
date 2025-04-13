package week1;
// Base class
class Animal {
    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}

// Subclass Dog
class Dog extends Animal {
    // @Override
    void makeSound() {
        System.out.println("Woof!");
    }
}

// Subclass Cat
class Cat extends Animal {
    // @Override
    void makeSound() {
        System.out.println("Meow!");
    }
}

// Main class
public class animalsounds {
    public static void main(String[] args) {
        Animal a = new Animal(); // base class object
        Dog d = new Dog();       // dog object
        Cat c = new Cat();       // cat object

        a.makeSound(); // prints: Some generic animal sound
        d.makeSound(); // prints: Woof!
        c.makeSound(); // prints: Meow!
    }
}

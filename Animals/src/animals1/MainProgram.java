package animals1;

import animals.Dog;
import animals.Cat;

public class MainProgram {
    public static void main(String[] args) {
        // Create instances of Dog and Cat
        Dog dog = new Dog();
        Cat cat = new Cat();

        // Call their sound methods
        dog.sound();
        cat.sound();
    }
}

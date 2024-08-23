class Animal {
    void sound() {
        System.out.println("The animal makes a sound");
    }
}

class Dog extends Animal {
    @Override
    void sound() {
        System.out.println("The dog barks");
    }
}

public class AnimalDemo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        animal.sound();

        Dog dog = new Dog();
        dog.sound();

        Animal dog2 = new Dog();
        dog2.sound();
    }
}
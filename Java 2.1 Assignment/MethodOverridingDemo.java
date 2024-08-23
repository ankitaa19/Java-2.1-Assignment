
class Animal {

    void makeSound() {
        System.out.println("Some generic animal sound");
    }
}


class Dog extends Animal {
    
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class MethodOverridingDemo {
    public static void main(String[] args) {
       
        Animal myAnimal = new Animal();
        myAnimal.makeSound();  

     
        Dog myDog = new Dog();
        myDog.makeSound();  

       
        Animal anotherAnimal = new Dog();
        anotherAnimal.makeSound();  
    }
}

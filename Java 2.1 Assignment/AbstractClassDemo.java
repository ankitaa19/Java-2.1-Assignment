
abstract class Animal {
    
    abstract void sound();
}


class Dog extends Animal {
   
    @Override
    void sound() {
        System.out.println("The dog barks.");
    }
}


class Cat extends Animal {
  
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}


public class AbstractClassDemo {
    public static void main(String[] args) {
        
        Animal myDog = new Dog();
        Animal myCat = new Cat();

        
        myDog.sound();
        myCat.sound(); 
    }
}

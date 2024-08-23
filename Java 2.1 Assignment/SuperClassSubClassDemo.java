
class Animal {
    String name;

    
    Animal(String name) {
        this.name = name;
    }

    
    void display() {
        System.out.println("Animal Name: " + name);
    }
}


class Dog extends Animal {
    String breed;

    
    Dog(String name, String breed) {
        super(name); 
        this.breed = breed;
    }

 
    @Override
    void display() {
        System.out.println("Dog Name: " + name);
        System.out.println("Breed: " + breed);
    }
}


public class SuperClassSubClassDemo {
    public static void main(String[] args) {
       
        Animal myAnimal;

        
        myAnimal = new Dog("Buddy", "Golden Retriever");

       
        myAnimal.display();
    }
}

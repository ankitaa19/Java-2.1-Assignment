
abstract class Animal {
  
    abstract void sound();
}


class Lion extends Animal {
   
    @Override
    void sound() {
        System.out.println("The lion roars.");
    }
}

class Cat extends Animal {
  
    @Override
    void sound() {
        System.out.println("The cat meows.");
    }
}

public class AnimalSoundDemo {
    public static void main(String[] args) {
        
        Animal myLion = new Lion();
        Animal myCat = new Cat();

       
        myLion.sound(); 
        myCat.sound(); 
    }
}

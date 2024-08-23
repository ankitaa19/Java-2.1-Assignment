
class Base {
    Base() {
        System.out.println("Base class constructor called.");
    }
}


class Intermediate extends Base {
    Intermediate() {
        System.out.println("Intermediate class constructor called.");
    }
}


class Derived extends Intermediate {
    Derived() {
        System.out.println("Derived class constructor called.");
    }
}

public class ConstructorSequenceDemo {
    public static void main(String[] args) {
   
        Derived obj = new Derived();
    }
}

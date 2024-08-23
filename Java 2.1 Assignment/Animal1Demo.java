
class Animal {
  
    private boolean vegetarian;
    private String food;
    private int numOfLegs;

 
    Animal() {
        this.vegetarian = false;
        this.food = "Unknown";
        this.numOfLegs = 0;
    }


    Animal(boolean vegetarian, String food, int numOfLegs) {
        this.vegetarian = vegetarian;
        this.food = food;
        this.numOfLegs = numOfLegs;
    }


    public boolean isVegetarian() {
        return vegetarian;
    }

    public void setVegetarian(boolean vegetarian) {
        this.vegetarian = vegetarian;
    }

    public String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public int getNumOfLegs() {
        return numOfLegs;
    }

    public void setNumOfLegs(int numOfLegs) {
        this.numOfLegs = numOfLegs;
    }


    @Override
    public String toString() {
        return "Animal [vegetarian=" + vegetarian + ", food=" + food + ", numOfLegs=" + numOfLegs + "]";
    }
}


class Cat extends Animal {
   
    private String color;

  
    Cat() {
        super(); 
        this.color = "Unknown";
    }

    Cat(boolean vegetarian, String food, int numOfLegs, String color) {
        super(vegetarian, food, numOfLegs); 
        this.color = color;
    }

    
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

 
    @Override
    public String toString() {
        return super.toString() + ", Cat [color=" + color + "]";
    }
}


class Cow extends Animal {
   
    private String breed;

    
    Cow() {
        super(); 
        this.breed = "Unknown";
    }


    Cow(boolean vegetarian, String food, int numOfLegs, String breed) {
        super(vegetarian, food, numOfLegs); 
        this.breed = breed;
    }

   
    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }


    @Override
    public String toString() {
        return super.toString() + ", Cow [breed=" + breed + "]";
    }
}


public class Animal1Demo {
    public static void main(String[] args) {
       
        Animal animal = new Animal(true, "Grass", 4);
        Cat cat = new Cat(true, "Fish", 4, "Black");
        Cow cow = new Cow(true, "Grass", 4, "Holstein");

 
        System.out.println(animal);
        System.out.println(cat);
        System.out.println(cow);
    }
}

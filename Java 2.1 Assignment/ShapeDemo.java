
abstract class Shape {
    
    abstract double calculateArea();
    abstract double calculateCircumference();
}


class Circle extends Shape {
    
    private double radius;

    
    Circle() {
        this.radius = 1.0; 
    }

    
    Circle(double radius) {
        this.radius = radius;
    }

   
    public double getRadius() {
        return radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }

    
    @Override
    double calculateArea() {
        return Math.PI * radius * radius;
    }

    
    @Override
    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }
}


class SemiCircle extends Shape {
    
    private double radius;

   
    SemiCircle() {
        this.radius = 1.0; 
    }

    
    SemiCircle(double radius) {
        this.radius = radius;
    }

   
    public double getRadius() {
        return radius;
    }

    
    public void setRadius(double radius) {
        this.radius = radius;
    }

   
    @Override
    double calculateArea() {
        return (Math.PI * radius * radius) / 2;
    }

    
    @Override
    double calculateCircumference() {
        return (2 * Math.PI * radius) / 2 + 2 * radius;
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
       
        Shape circle = new Circle(5); 
        Shape semiCircle = new SemiCircle(5); 

       
        System.out.println("Circle with radius 5:");
        System.out.println("Area: " + circle.calculateArea());
        System.out.println("Circumference: " + circle.calculateCircumference());

        
        System.out.println("\nSemiCircle with radius 5:");
        System.out.println("Area: " + semiCircle.calculateArea());
        System.out.println("Circumference: " + semiCircle.calculateCircumference());
    }
}


interface Figure {
  
    double PI = 3.14159;

    
    double area();

    
    double perimeter();
}


interface Draw {

    void drawShape();
}


class Circle implements Figure, Draw {
    private double radius;

    Circle(double radius) {
        this.radius = radius;
    }

    @Override
    public double area() {
        return PI * radius * radius;
    }


    @Override
    public double perimeter() {
        return 2 * PI * radius;
    }


    @Override
    public void drawShape() {
        System.out.println("Drawing a circle with radius: " + radius);
    }
}


class Rectangle implements Figure, Draw {
    private double width;
    private double height;

 
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }


    @Override
    public double area() {
        return width * height;
    }

    @Override
    public double perimeter() {
        return 2 * (width + height);
    }

    
    @Override
    public void drawShape() {
        System.out.println("Drawing a rectangle with width: " + width + " and height: " + height);
    }
}


public class MultipleInheritanceDemo {
    public static void main(String[] args) {
    
        Figure circle = new Circle(5);
        Figure rectangle = new Rectangle(4, 6);

       
        Draw drawCircle = (Draw) circle;
        Draw drawRectangle = (Draw) rectangle;

       
        System.out.println("Circle Area: " + circle.area());
        System.out.println("Circle Perimeter: " + circle.perimeter());
        drawCircle.drawShape();

        System.out.println("Rectangle Area: " + rectangle.area());
        System.out.println("Rectangle Perimeter: " + rectangle.perimeter());
        drawRectangle.drawShape();
    }
}

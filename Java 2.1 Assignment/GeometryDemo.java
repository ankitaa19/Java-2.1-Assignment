class Geometry {
   
    double calculateArea(double side) {
        return side * side;
    }

    
    double calculateArea(double radius, boolean isCircle) {
        if (isCircle) {
            return Math.PI * radius * radius;
        }
        return 0; 
    }

   
    double calculateArea(double length, double width) {
        return length * width;
    }
}

public class GeometryDemo {
    public static void main(String[] args) {
        Geometry geo = new Geometry();

        
        double squareSide = 5.0;
        double squareArea = geo.calculateArea(squareSide);
        System.out.println("Area of the square: " + squareArea);


        double circleRadius = 3.0;
        double circleArea = geo.calculateArea(circleRadius, true);
        System.out.println("Area of the circle: " + circleArea);

       
        double rectangleLength = 4.0;
        double rectangleWidth = 6.0;
        double rectangleArea = geo.calculateArea(rectangleLength, rectangleWidth);
        System.out.println("Area of the rectangle: " + rectangleArea);
    }
}

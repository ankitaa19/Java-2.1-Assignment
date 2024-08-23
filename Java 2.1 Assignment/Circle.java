class Circle {

    private double radius;


    public Circle() {
        this.radius = 1.0; 
    }

    
    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

  
    public double calculateArea() {
        return Math.PI * radius * radius;
    }

    public double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    public static void main(String[] args) {
       
        Circle circle1 = new Circle();
        System.out.println("Circle 1:");
        System.out.println("Radius: " + circle1.getRadius());
        System.out.println("Area: " + circle1.calculateArea());
        System.out.println("Circumference: " + circle1.calculateCircumference());

       
        Circle circle2 = new Circle(2.5);
        System.out.println("\nCircle 2:");
        System.out.println("Radius: " + circle2.getRadius());
        System.out.println("Area: " + circle2.calculateArea());
        System.out.println("Circumference: " + circle2.calculateCircumference());
    }
}

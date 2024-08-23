
class Figure {
  
    protected double dim1;
    protected double dim2;


    Figure(double dim1, double dim2) {
        this.dim1 = dim1;
        this.dim2 = dim2;
    }

  
    double area() {
        return 0; 
    }
}


class Rectangle extends Figure {

   
    Rectangle(double width, double height) {
        super(width, height); 
    }


    @Override
    double area() {
        return dim1 * dim2; 
    }
}

class Triangle extends Figure {

   
    Triangle(double base, double height) {
        super(base, height); 
    }


    @Override
    double area() {
        return 0.5 * dim1 * dim2; 
    }
}


public class DynamicMethodDispatchDemo {
    public static void main(String[] args) {
     
        Figure fig1 = new Rectangle(10, 5);
        Figure fig2 = new Triangle(10, 5);

      
        Figure[] figures = {fig1, fig2};

        for (Figure fig : figures) {
            System.out.println("Area: " + fig.area());
        }
    }
}

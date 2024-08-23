class Box1 {
    double width, height, depth;


    Box1(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
    }

    double volume() {
        return width * height * depth;
    }
}

class BoxWt extends Box1 {
    double weight;

 
    BoxWt(double w, double h, double d, double m) {
        super(w, h, d);  
        weight = m;
    }
}

class BoxColor extends BoxWt {
    String color;

 
    BoxColor(double w, double h, double d, double m, String c) {
        super(w, h, d, m);  
        color = c;
    }

    void display() {
        System.out.println("Dimensions: " + width + " x " + height + " x " + depth);
        System.out.println("Volume: " + volume());
        System.out.println("Weight: " + weight);
        System.out.println("Color: " + color);
    }
}

public class MultiLevelInheritanceDemo {
    public static void main(String[] args) {
     
        BoxColor myBox = new BoxColor(10, 20, 15, 34.3, "Red");

    
        myBox.display();
    }
}

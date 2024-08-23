
class Box {
    double width, height, depth;

    
    Box() {
        width = 1.0;
        height = 1.0;
        depth = 1.0;
        System.out.println("Box default constructor called");
    }

   
    Box(double w, double h, double d) {
        width = w;
        height = h;
        depth = d;
        System.out.println("Box parameterized constructor called");
    }

 
    Box(Box ob) {
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
        System.out.println("Box copy constructor called");
    }

   
    double volume() {
        return width * height * depth;
    }
}


class BoxWt extends Box {
    double weight;

    BoxWt() {
        super(); 
        weight = 0.0;
        System.out.println("BoxWt default constructor called");
    }


    BoxWt(double w, double h, double d, double m) {
        super(w, h, d); 
        weight = m;
        System.out.println("BoxWt parameterized constructor called");
    }

 
    BoxWt(BoxWt ob) {
        super(ob); 
        weight = ob.weight;
        System.out.println("BoxWt copy constructor called");
    }


    void print_BoxWt() {
        System.out.println("Dimensions: " + width + " x " + height + " x " + depth);
        System.out.println("Volume: " + volume());
        System.out.println("Weight: " + weight);
    }
}


public class BoxDemo {
    public static void main(String[] args) {
       
        BoxWt box1 = new BoxWt();
        box1.print_BoxWt();

    
        BoxWt box2 = new BoxWt(10, 20, 15, 34.3);
        box2.print_BoxWt();

        BoxWt box3 = new BoxWt(box2);
        box3.print_BoxWt();
    }
}

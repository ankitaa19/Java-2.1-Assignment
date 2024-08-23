class Complex {
    private double real;
    private double imag;

    public Complex() {
        real = 0.0;
        imag = 0.0;
    }

    public Complex(double real, double imag) {
        this.real = real;
        this.imag = imag;
    }

    public Complex add(Complex n) {
        return new Complex(real + n.real, imag + n.imag);
    }

    public Complex subtract(Complex n) {
        return new Complex(real - n.real, imag - n.imag);
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImag(double imag) {
        this.imag = imag;
    }

    public double getReal() {
        return real;
    }

    public double getImag() {
        return imag;
    }

    @Override
    public String toString() {
        return real + " + " + imag + "i";
    }
}

public class ComplexDemo {
    public static void main(String[] args) {
        Complex c1 = new Complex(3, 2);
        Complex c2 = new Complex(1, -5);

        System.out.println("c1: " + c1);
        System.out.println("c2: " + c2);

        Complex sum = c1.add(c2);
        System.out.println("Sum: " + sum);

        Complex diff = c1.subtract(c2);
        System.out.println("Difference: " + diff);
    }
}

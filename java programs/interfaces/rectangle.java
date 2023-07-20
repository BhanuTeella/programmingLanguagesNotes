package interfaces;


public class rectangle extends shape {
    private double ln, br;

    public rectangle(double a, double b) {
        ln = a;
        br = b;
    }

    public double perimeter() {
        return 2 * (ln + br);
    }

    public double area() {
        return ln * br;
    }

   
}

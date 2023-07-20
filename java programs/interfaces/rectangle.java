package interfaces;


public class rectangle extends shape implements comparable {
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
    
    public int cmp(comparable obj){
        if (obj instanceof rectangle){
            rectangle r=(rectangle)obj;
            if(this.area()>r.area())
                return 1;
            else if(this.area()<r.area())
                return -1;
            else
                return 0;
        }
        else
            return -2;
    }
}

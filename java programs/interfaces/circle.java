package interfaces;
public class circle extends shape {
    private double radius;
    public circle(double r){
        radius=r;
    }
    public double area(){//abstract method of parent class must be implemented in child class
        return 3.14*radius*radius;
    }
    public double perimeter(){
        return 2*3.14*radius;
    }

}

package interfaces;

public class Main {
    public static void main(String[] args){
        //shape s=new shape();//abstract class can't be instantiated
        circle c=new circle(7);
        rectangle r=new rectangle(10,20);
        System.out.println("Area of circle is "+c.area());
        System.out.println("Perimeter of circle is "+c.perimeter());
        System.out.println("Area of rectangle is "+r.area());
        System.out.println("Perimeter of rectangle is "+r.perimeter());
        c.display();// non abstract method of abstract class can be used by child class without overriding
        r.display();

        rectangle r1=new rectangle(10,20);
        rectangle r2=new rectangle(5,30);

        System.out.println(r1.cmp(r2));
    }
}

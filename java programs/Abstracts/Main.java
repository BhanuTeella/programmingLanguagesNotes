package Abstracts;

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


        person p1=new person("Rahul",20);
        person p2= new person("Bhanu",21);
        System.out.println(p1.cmp(p2));//person as it extends comparable class can be compared. 
        //but circle and rectangle can't be compared as they can't extend comparable class as they already extend shape class. 
    }
}

package interfaces;
//abstract class is a class which can't be instantiated
//abstract class is used to implement the abstraction in java
//abstract class is used to implement the polymorphism in java
//abstract class mandates the child class to implement the abstract methods of parent class
//Does not depend on programmers discipline
public abstract class shape {
    public abstract double area();//abstract class can have both abstract and non abstract methods
    public abstract double perimeter();
    public void display(){
        System.out.println("This is a shape");
    }//non abstract method-can be used by child class without overriding
}

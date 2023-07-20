package inheritance;
public class Manager extends Employee {//extends keyword is used to inherit from parent class
private String secretary="Sue";

//constructor for child class/sub class
public Manager(String s, double x, String sec) {
    super(s, x);//super keyword is used to call the constructor of parent class to initialize the instance variables of parent class
    secretary = sec;
}

public boolean setSecretary(String s) {
    secretary = s;
    return true;
}

public String getSecretary() {
    return secretary;
}

//overiding in java
//overriding is the process of replacing the method of parent class with the method of child class
//overriding is used to implement the polymorphism in java
//overriding is used to implement the dynamic binding in java-which method to call is decided at runtime

//without overriding, the method of parent class is called when we execute obj.bonus(5.0) in classTest.java
//with overriding, the method of child class is called when we execute obj.bonus(5.0) in classTest.java

public double bonus(double percent) {//overriding the method of parent class-can use @override annotation to make sure that the method is overridden
    System.out.println("Manager's bonus");
    return 1.5 * super.bonus(percent);
}


}




public class DOB_class{//class definition
    

    //In Java, being OOP languages, everything is defined in context of classes
    //classes are user defined data types
    //classes are blueprints for objects
    //classes are declared using the class keyword
    //classes can be public or default(no access modifier)
    //public classes can be accessed from anywhere
    //default classes can be accessed only from the same package

    //objects are instances of classes
    //object creation--->class_name object_name=new class_name();

    //objects have states and behaviors--->variables and methods
    //states are represented by variables--->fields or variables
    //behaviors are represented by methods--->functions or methods
    //classes can have variables and methods
    //variables are also called fields
    //methods are also called functions

    //variable declaration
    private int day;//private variables can be accessed only from the same class
    public int month;//public variables can be accessed from anywhere
    int year;//default variables can be accessed only from the same package
    
    /*In Java, a package is a way to organize related classes and interfaces.
     A package is a collection of related classes and interfaces that are grouped together under a common namespace. 
     Packages help to avoid naming conflicts and make it easier to manage large projects.
    A package is defined using the package keyword at the beginning of a Java source file. 
    For example, the following code defines a package called com.example:
        package com.example;

        public class MyClass {
        // class code here
        }

        //package structure:
        com/
            example/
                MyClass.java
                AnotherClass.java

    */
    
    
    // constructor--->used to initialize the objects of the class. starts with the name of the class
    // can be private in which case only the saame class can create objects of the class
    public DOB_class(int a, int b, int c) {
        day=a;
        month = b;
        year = c;
    
    }

    // instance method
    public void displayDOB() {
    System.out.println("DOB: "+day+"/"+month+"/"+year);
    }

    //getter and setter methods
    public int getDay(){
        return day;
    
    }
    public int getMonth(){
        return month;
    
    }
    public int getYear(){
        return year;
    
    }

    private void setDay(int a){
        day=a;
    
    }

    private void setMonth(int a){
        month=a;
    
    }

    private void setYear(int a){
        year=a;
    }

    public void setDate(int a, int b, int c){
        if (a>0 && a<32 && b>0 && b<13 && c>0){
            //day=a;
            //month=b;
            //year=c;
            setDay(a);
            setMonth(b);
            setYear(c);
        }
        else{
            System.out.println("Invalid date");
        }
    }



    

    public static void main(String[] args){
        //object creation
        DOB_class obj=new DOB_class(10,12,2003);
        obj.displayDOB();
        obj.month=11;
        obj.displayDOB();
        obj.year=2004;
        obj.displayDOB();
        obj.day=32;//this would have generated error, if it had been accessed in other classes, as day is private variable
        obj.displayDOB();
        obj.setDay(11);
        obj.displayDOB();
        obj.setDate(10, 12, 2003);
        obj.displayDOB();

    }




    
}
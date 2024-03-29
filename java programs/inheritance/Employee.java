package inheritance;

    public class Employee {
        private static int employee_count=0;//static variable is shared by all objects of the class
        private String name;
        private double salary=1000.0;

        //constructor
        public Employee(String s, double x) {
            
            name = s;
            salary = x;
            employee_count++;
        }

        //overloading in java
        //overloading is the process of creating multiple methods with same name but different parameters
        //overloading is used to implement the polymorphism in java
        //overloading is used to implement the static binding in java-which method to call is decided at compile time
        
        //overloading of constructor
        public Employee(String s) {//when user supply only name,this constructor is used to create the object. salary is set to default value
            name = s;
            salary = 1000.0;   //default salary
            employee_count++;
        }
    
        public boolean setName(String s) {
            name = s;
            return true;
        }
    
        public boolean setSalary(double x) {
            salary = x;
            return true;
        }
    
        public String getName() {
            return name;
        }
    
        public double getSalary() {
           return salary;
        }
    
    
        public double bonus(double percent) {
            System.out.println("Employee's bonus");
            return (percent / 100.0) * salary;
        }
        public static int gettotalEmployeeCount(){
            return employee_count;
        }
    }
    

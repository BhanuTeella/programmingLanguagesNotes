package inheritance;

public class classTest {
    public static void main(String[] args) {
        //creating Employee objects
        Employee e1 = new Employee("John", 1000.0);

        //creating Manager objects
        Manager m1 = new Manager("lam", 2000.0, "Sue");
        
        
        //Every manager is an employee but not every employee is a manager. so we can create  new manager object with employee type .
        Employee e2 = new Manager("Ram", 2000.0, "ravi");
        //e2 is a manager object but it is created with employee type. so we can't access the methods of manager class.
        //e2.setSecretary("ravi"); //creates error

        //Dynamic dispatch
        //Dynamic dispatch is the process of deciding which method to call at runtime.
        e2.bonus(5.0);//bonus method of manager class is called. as e2 is a manager object. an example of dynamic dispatch
        

        //this way which bonus to apply can be decided at runtime for an array of employees
        Employee[] emparray = new Employee[2];
        emparray[0] = e1;
        emparray[1] = m1;
        for (int i = 0; i < emparray.length; i++) {
            System.out.println(emparray[i].bonus(5.0));//employee bonus is calld for first element and manager bonus is called for second element
        }
    }
}

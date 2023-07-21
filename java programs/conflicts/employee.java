package conflicts;

public class employee extends salary implements person,designation {
    // getName() method should not have been required as the default method is already defined in the interfaces
    //but person and designation have the same method getName() leading to a conflict
    //so we have to override the method in the class
    public String getName(){
        return("from class employee");
    }

    //getsalary method is a method in both salary(class) and designation(interface)
    //although there is a conflict, java priortizes the method in the class
    //so we do not have to override the method in the class


    
    
}

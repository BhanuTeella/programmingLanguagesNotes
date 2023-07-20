package interfaces;

public class conflicts {
    public interface Person{
    public default String getName() {
    return("No name");
    }
    }
    public interface Designation{
    public default String getName() {
    return("No designation");
    }
    }
    public class Employee
    implements Person, Designation {...}
}

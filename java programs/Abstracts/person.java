package Abstracts;

public class person extends comparable {
    private String name;
    private int age;

    public person(String s, int a) {
        name = s;
        age = a;
    }

    public int cmp(comparable s) {
        if (!(s instanceof person)) {
            System.out.println("Error: incompatible types");
            return 0;
        }
        person p = (person) s;
        if (this.age > p.age) {
            return 1;
        } else if (this.age < p.age) {
            return -1;
        } else {
            return 0;
        }
    }
    public String toString(){
        return("Name: "+name+"\nAge: "+age);
    }
}

package conflicts;

public interface person {
    public default String getName(){
        return("from interface person");}
    
}

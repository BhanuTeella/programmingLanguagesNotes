package interfaces;

public interface comparable {
    //public abstract int cmp(comparable c);//creates a generic function to compare two objects
    public default int cmp(comparable c){
        return 0;
    }
}
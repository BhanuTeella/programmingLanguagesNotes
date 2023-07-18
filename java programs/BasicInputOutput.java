import java.util.Scanner;

public class BasicInputOutput {
    public static void main(String args[]){
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");//println is used to print  and move to new line
        int a=sc.nextInt();
        System.out.print("You entered: "+a);//print is used to print in same line
        sc.close();*/
        
        //Alternate implementation
        try(Scanner sc= new Scanner(System.in)){
            System.out.println("Enter a number: ");//println is used to print  and move to new line
            int a=sc.nextInt();
            System.out.print("You entered: "+a);//print is used to print in same line
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }
    }
    
}

import java.io.Console;
//import java.util.Scanner;

public class BasicInputOutput {
    public static void main(String[] args){

        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter a number: ");//println is used to print  and move to new line
        int a=sc.nextInt();
        System.out.print("You entered: "+a);//print is used to print in same line
        sc.close();*/

        //Alternate implementation
        /*try(Scanner sc1= new Scanner(System.in)){
            System.out.println("Enter a number: ");//println is used to print  and move to new line
            int b=sc1.nextInt();
            System.out.print("You entered: "+b);//print is used to print in same line
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
        finally{
            System.out.println("Finally block executed");
        }*/

        //reading string
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter your name: ");
        String name=sc.nextLine();
        System.out.println("Hello "+name);
        sc.close();*/

        //reading multiple values
        /*Scanner sc= new Scanner(System.in);
        System.out.println("Enter two numbers: ");
        String input=sc.nextLine();
        sc.close();
        String[] numbers=input.split(" ");//input is stored as string and split() is used to split the string into multiple strings
        int a=Integer.parseInt(numbers[0]);// need to convert string to integer
        int b=Integer.parseInt(numbers[1]);
        System.out.println("you entered : "+a+','+b);
        System.out.println(a+b);//prints sum of a and b*/

        //formatted output using printf
        //printf(similar to c) does not move to new line
        /*int a=10;
        float b=10.5f;
        double c=10.25661651;
        String name="Sourav";
        System.out.printf("Hi %s! a = %d and b = %f\n",name,a,b);//%s for string %d for integer and %f for float and double
        System.out.printf("c = %.2f",c);//%.2f means print only 2 decimal places
        */

        //using console class
        Console cons=System.console();
        String name=cons.readLine("Enter your name: ");//like input() in python
        char[] password=cons.readPassword("Enter your password: ");
        System.out.println("Hello "+name);
        System.out.println("Your password is: "+String.valueOf(password));//converts char array to string




    }
    
}

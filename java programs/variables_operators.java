import java.util.Scanner;
public class variables_operators {
    public static void main(String[] args){
        int a;//variable declaration
        a=10;//variable initialization
        System.out.println("a = "+a);

        float b=10.5f;//floating point number. Need f to denote float else it is considered as double
        float c=10.2f,d=10.3f;//dynamic initialization
        System.out.println("sum = "+b+c+d);


        System.out.println("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        String input=sc.nextLine();
        sc.close();

        String[] numbers=input.split(" ");
        int num1=Integer.parseInt(numbers[0]);
        int num2=Integer.parseInt(numbers[1]);
        
        //use of various operators
        float sum,sub,mul,div,mod,pow;
        sum=num1+num2;//implicit typecasting to float
        sub=num1-num2;
        mul=num1*num2;
        div=num1/num2;
        mod=num1%num2;
        pow=(float)Math.pow(num1,num2);//Math.pow() returns double so typecast to float

        System.out.println("sum = "+sum);
        System.out.println("sub = "+sub);
        System.out.println("mul = "+mul);
        System.out.println("div = "+div);
        System.out.println("mod="+mod);
        System.out.println("power="+pow);


    }
}

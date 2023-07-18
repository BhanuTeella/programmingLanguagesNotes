#include <iostream>
using namespace std;
int main()
{
   int a;//variable declaration
   a=10;// variable initialization
   int b=3;//dynamic initialization

   //use of arthmetic operators
   int sum,sub,mul,div,mod;//multiple variable declaration
    sum=a+b;
    sub=a-b;
    mul=a*b;
    div=a/b;//integer division 5/3=1. similar to floor function '//' in python
    mod=a%b;//gives remainder
    
    cout<<"sum="<<sum<<endl;// use of endline 
    cout<<"sub="<<sub<<endl;
    cout<<"mul="<<mul<<endl;
    cout<<"div="<<div<<endl;
    cout<<"mod="<<mod<<endl;

    ++a;//increment operator  increases a by 1 
    --b;//decrement operator decreases b by 1
    cout<<a<<endl;
    cout<<b<<endl;


    //use of relational operators
    bool isEqual=a==b;//false
    bool isNotEqual=a!=b;//true
    cout << isEqual << endl;
    cout << isNotEqual << endl;

            //comparision of signed and unsigned integers
            unsigned int c=10;
            int d=-15;
            bool isGreater=c>d;
            cout<<"signed and unsigned comparision leads to false although actually true:"<<isGreater<<endl;//due to binary storing of negative numbers in 2's complement form


    //in conditional statements
    if (a==b)//similar usage for other relational operators
    {
        cout<<"a is equal to b"<<endl;
    }
    else
    {
        cout<<"a is not equal to b"<<endl;

    }

    //use of logical operators
    bool isTrue=(4>4)||(5<=5);//although 4 is not greater than 4 but 5 is less than or equal to 5 so it is true


    //conditional operator
    int x=10;
    int y=20;
    int z=(x>y)?x:y;//if x>y is true then z=x else z=y
    cout<<z<<endl;

    int v=(x<y)?1000:5000;//if x<y is true then v=1000 else v=5000
    cout<<v<<endl;
    int m,n;
    v>5000?m:n=100;//if v>5000 is true then m=100 else n=100

    char result=(x<35)?'f':'p';//if x<35 is true then result='f' else result='p'
    cout<<result<<endl;

    //other operators
    cout<<sizeof(int)<<endl;//returns size of int in bytes
    cout<<sizeof('a')<<endl;//returns size of a in bytes
    cout<<sizeof(x)<<endl;//returns size of variable x in bytes
    //comma operator

    int comma=(x+1,x*100);//comma operator evaluates all the expressions and returns the last expression, here implements x*100
    cout<<"X:"<<x<<"comma operator"<<comma<<endl;

    



    
    return 0;
}
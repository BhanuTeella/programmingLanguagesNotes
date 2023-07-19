#include<iostream>
#include<string>
using namespace std;
int main()
{
    int a[5]={1,2,3,4,5};
    int b[]={6,7,8,9,10};
    cout<<a[3]<<','<<b[3]<<endl;
    
    char c[]="Hello";
    cout<<c<<endl;
    cout<<c[0]<<endl;

    char name[5];
    cout<<"Enter your name: ";
    cin.getline(name,5);
    cout<<"Hello "<<name[4]<<endl;

    return 0;
}
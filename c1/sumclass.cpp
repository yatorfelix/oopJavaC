#include <iostream>
using namespace std;
class Add{
    int num1,num2,num3,sum;
    
public:
    void get(){
        cout<<"Enter the first number:\n";
        cin>>num1;
        cout<<"Enter the second number: \n";
        cin>>num2;
        
        cout<<"Enter the third number: \n";
        cin>>num3;
    };
    
    int addition1(){
        
        sum = num1 + num2 ;
        cout<<"The results is "<<sum;
        
        return sum;
    };
    int addition2(){
        
        sum = num1 + num2 + num3;
        cout<<"\n The results is "<<sum;
        return sum;
    }
};
int main() {

    Add a;
    a.get();
    a.addition1();
    a.addition2();
    return 0;
};
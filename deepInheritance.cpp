#include <iostream>
using namespace std;
class Shapes{
    protected:
    float width,length,area,perimeter;

    public:

    void get_length(){
        cout<<"Enter the length of the rectangle : \n";
        cin>>length;
        cout<<"Enter the width of the rectangle :\n ";
        cin>>width;
    }

};
class rectangle: public Shapes{
    public:
    int findarea(){
        
        area = length * width ;
        cout<<"The results is "<<area;
        
        return area;
    };
    int findperimeter(){
        
        perimeter = 2*(length+width) ;
        cout<<"\n The results is "<<perimeter;
        
        return perimeter;
    };

    
};
class triangle: public Shapes{
    float base,height;

    public:
    int findarea(){
        
        area = base * height ;
        cout<<"\n The results is "<<area;
        
        return area;
    };
    int findperimeter(){
        
        perimeter = base+base+base ;
        cout<<"\n The results is "<<perimeter;
        
        return perimeter;
    };

};

int main() {
    rectangle a;
    a.get_length();
    a.findarea();
    a.findperimeter();

    triangle t;
    t.get_length();
    t.findarea();
    t.findperimeter();
    return 0;
};

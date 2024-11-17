#include<stdio.h>

struct Demo
{

    int no = 11;
    float f = 90.99;        // By this way we cant initialize the variable
    double d;
    int i;
};

int main()
{

    struct Demo obj;
    
    obj.no = 11;
    obj.f = 90.99;              // By This Way We Can Initialize The Elements of The Structure



    return 0;
}
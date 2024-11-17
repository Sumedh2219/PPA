#include<iostream>
using namespace std;

class Demo
{
    public:
        int Addition(int A, int B)                // Addition@2ii
        {
            return A+B;
        }

         double Addition(double A, double B)      // Addition@2dd
        {
            return A+B;
        }

         int Addition(int A, int B, int C)        // Addition@3iii
        {
            return A+B+C;
        }


};

int main()
{
    Demo obj;
    cout<<obj.Addition(10,11)<<"\n";
    cout<<obj.Addition(10.25,11.56)<<"\n";
    cout<<obj.Addition(10,11,12)<<"\n";




    return 0;
}





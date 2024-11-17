#include<iostream>
using namespace std;

class Demo
{
     public:
         int No1, No2;


         Demo(int A, int B)
         {
            No1 = A;
            No2 = B;
         }

         void Fun()
         {
            No1++;
            No2++;
         }

         void Gun() const
         {
           // No1++;   NA
            // No2++;  NA
         }

};


int main()
{
      Demo obj(10,20);
      const Demo obj2(11,21);
      

      obj1.Fun();
      obj1.Gun();


      obj2.Fun();       // NA
      obj2.Gun();       // A




    return 0;
}
#include<stdio.h>


#pragma pack(1)
struct Demo
{

   int i;
   float f;
   char ch;
   double d;

};

union Hello
{

   int i;           //4
   float f;         //4
   char ch;         //1
   double d;        //8
                    // Largest : 8
};

int main()
{

    struct Demo dobj;
    union Hello hobj;

    printf("Size of structure is : %d\n",sizeof(dobj));    // 17
    printf("Size of union is : %d\n",sizeof(hobj));        // 8
     return 0;
}
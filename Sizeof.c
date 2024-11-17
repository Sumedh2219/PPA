#include<stdio.h>

int main()
{
   char c = 'D';         // C is a variable of type charecter initialized with value D 
   int i = 11;           // i is a variable of type integer initialized with value 11
   float f = 70.45;      // f is a variable of type float initialized with value 70.45
   double d = 76.9867;   // d is a variable of type double initialized with value 76.9867

   

   printf("%d\n",sizeof(c)); //1
   printf("%d\n",sizeof(i)); //4
   printf("%d\n",sizeof(f)); //4
   printf("%d\n",sizeof(d)); //8
    return 0;
}
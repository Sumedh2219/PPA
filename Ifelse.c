#include<stdio.h>


int main()
{
  
   int No = 0;
   int Result = 0;

   printf("Enter number : \n");
   scanf("%d\n",&No);

   Result = No % 2;

   if(Result == 0)
   {

      printf("It is Even Number\n");


   }

   else
   {
      printf("It is Odd Number");
   }
  


    return 0;
}
#include<stdio.h>                  //  Standard input Ouutput
#include<stdlib.h>                // Standard Library



int main()
{
     int *ptr = NULL;
     
     // Step 1: Allocate the Memory
     ptr = (int *)malloc(5 * sizeof(int));

     // Step 2 : Use the Memory

     free (ptr);


    return 0;
}
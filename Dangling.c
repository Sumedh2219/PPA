#include<stdio.h>



int main()
{
    int *p = NULL;

    p = (int *)malloc(5 * sizeof(int));

    free(p);

    // Now p is dangling pointer

    return 0;
}
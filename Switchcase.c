#include<stdio.h>



int main()
{

    int Standard = 0;

    printf("Enter your standard : \n");
    scanf("%d",&Standard);

    switch(Standard)
    {
        
        case 1:
             printf("Youe Exam Is At 8 Am\n");
             break;


        case 2:
             printf("Youe Exam Is At 9 Am\n");
             break;

        
        case 3:
               printf("Youe Exam Is At 10 Am\n");
             break;


        case 4:
            printf("Youe Exam Is At 11 Am\n");
             break;

        case 5:
            printf("Your Exam Is at 12 Am\n ");
            break;



        default:
             printf("You Entered Wrong Choice\n");



    }





    return 0;
}
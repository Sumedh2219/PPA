#include<iostream>
using namespace std;

class Arithmatic
{
    public :
        int No1;
        int No2;

        Arithmatic(int A, int B)
        {
            No1 = A;
            No2 = B;
        }

        int Addition()
        {
            int Ans = 0;
            Ans = No1 + No2;
            return Ans;
        }

        int Substraction()
        {
            int Ans = 0;
            Ans = No1 - No2;
            return Ans;
        }
};

int main()
{

int iValue1 = 0, iValue2 = 0, iRet = 0;

cout<<"Enter First Number  : \n";
cin>>iValue1;

cout<<"Enter Second Number  : \n";
cin>>iValue2;


Arithmatic obj(iValue1,iValue2);

iRet = obj.Addition();
cout<<"Addition is : "<<iRet<<"\n";

iRet = obj.Substraction();
cout<<"Substrction is : "<<iRet<<"\n";




    return 0;
}
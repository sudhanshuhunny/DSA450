/* Problem 2 
Maximum and minimum of an array using minimum number of comparisons*/
#include<iostream>

using namespace std;
int main()
{
int a[]={1,2,3},maxNum,minNum;
int sizeOfArray=sizeof(a)/4;
    for (int i = 0; i < sizeOfArray; i++)
    {
         maxNum=a[0];
        minNum=a[0];
        if(maxNum<a[i])
        {
            maxNum=a[i];
        }
        if(minNum>a[i])
        {
            minNum=a[i];
        }
        /* code */
        
    }
    cout<<maxNum<<endl;
    cout<<minNum;
    
}

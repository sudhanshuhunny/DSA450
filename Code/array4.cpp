/* Given an array of size N containing only 0s, 1s, and 2s; sort the array in ascending order. */
#include<bits/stdc++.h>
using namespace std;
int main()
{
int t;
cin>>t;
while(t--)
{
    int n,i,p;
    cin>>n;
    int a[n];
    for(i=0;i<=n;i++)
    {
        cin>>p;
        if(p==0||p==1||p==2)
        {
            a[i]=p;
        }
        else
        {
            cout<<"Enter only 0's 1's and 2's";
        }
        
    }
}

}
void sort(int b[])

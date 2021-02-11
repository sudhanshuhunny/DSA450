/* Rearrange array in alternating positive & negative items with O(1) extra space | Set 1
Difficulty Level : Hard
 Last Updated : 24 Nov, 2020
Given an array of positive and negative numbers, arrange them in an alternate fashion such that every positive number is followed by negative and vice-versa maintaining the order of appearance. 
Number of positive and negative numbers need not be equal. If there are more positive numbers they appear at the end of the array. If there are more negative numbers, they too appear in the end of the array.

Examples : 

Input:  arr[] = {1, 2, 3, -4, -1, 4}
Output: arr[] = {-4, 1, -1, 2, 3, 4}

Input:  arr[] = {-5, -2, 5, 2, 4, 7, 1, 8, 0, -8}
output: arr[] = {-5, 5, -2, 2, -8, 4, 7, 1, 8, 0}  */
#include<bits/stdc++.h>
using namespace std;
int main ()
{
    int i,j,n,count_neg=0,count_pos=0;
    cin>>n;
    int a[n];
    for(i=0;i<n;i++)
    {
        cin>>a[i];

    }
    for(i=0;i<n;i++)
    {
        if(a[i]<0)
        {
            count_neg++;
            
        }
        else{count_pos++;}
    }

cout<<endl<<count_neg<<" "<<count_pos;

}
/* Given an array (or string), the task is to reverse the array/string.
Examples : 
 

Input  : arr[] = {1, 2, 3}
Output : arr[] = {3, 2, 1}

Input :  arr[] = {4, 5, 1, 2}
Output : arr[] = {2, 1, 5, 4}
*/


#include<iostream>
using namespace std;
// My approach 
int main()
{
    int i,n;
    char a[]={'a','b','c'};
    n=sizeof(a);
    cout<<n<<endl;
    for (i=n-1;i>=0;--i)
    {
        
        cout<<a[i];
    }
}

//GFG approach 
/*
#include <bits/stdc++.h>
using namespace std;
 
 Function to reverse arr[] from start to end
void rvereseArray(int arr[], int start, int end)
{
    while (start < end)
    {
        int temp = arr[start]; 
        arr[start] = arr[end];
        arr[end] = temp;
        start++;
        end--;
    } 
}     
 

void printArray(int arr[], int size)
{
   for (int i = 0; i < size; i++)
   cout << arr[i] << " ";
 
   cout << endl;
} 
 

Driver function to test above functions
int main() 
{
    int arr[] = {1, 2, 3, 4, 5, 6};
     
    int n = sizeof(arr) / sizeof(arr[0]); 
 
    // To print original array 
    printArray(arr, n);
     
    // Function calling
    rvereseArray(arr, 0, n-1);
     
    cout << "Reversed array is" << endl;
     
    // To print the Reversed array
    printArray(arr, n);
     
    return 0;
}
Output : 

1 2 3 4 5 6 
Reversed array is 
6 5 4 3 2 1 

*/

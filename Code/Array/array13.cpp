/*
Kadane's Algorithm 
Medium Accuracy: 51.0% Submissions: 43860 Points: 4
Given an array arr of N integers. Find the contiguous sub-array with maximum sum.

 

Example 1:

Input:
N = 5
arr[] = {1,2,3,-2,5}
Output:
9
Explanation:
Max subarray sum is 9
of elements (1, 2, 3, -2, 5) which 
is a contiguous subarray.
Example 2:

Input:
N = 4
arr[] = {-1,-2,-3,-4}
Output:
-1
Explanation:
Max subarray sum is -1 
of element (-1)
 

Your Task:
You don't need to read input or print anything. The task is to complete the function maxSubarraySum() which takes arr and N as input parameters and returns the sum of subarray with maximum sum.

 

Expected Time Complexity: O(N)
Expected Auxiliary Space: O(1)

 

Constraints:
1 ≤ N ≤ 106
-107 ≤ A[i] <= 107


*/
#include<bits/stdc++.h>
using namespace std;

int maxSubArraySum(int a[],int n)
{
    int max_gb=a[0];
    int max_c=a[0];
    for (int i = 1; i < n; i++)
    {
        max_c=max(a[i],max_c+a[i]);
        if(max_c>max_gb)
        {
            max_gb=max_c;
        }
    }
    return max_gb;
    
}


int main()
{
    int n,i;
    cin>>n;
    int a[n];
    for ( i = 0; i < n; i++)
    {
        cin>>a[i];

    }
    int b = maxSubArraySum(a,n);
    cout<<b;

    
   return 0; 
}

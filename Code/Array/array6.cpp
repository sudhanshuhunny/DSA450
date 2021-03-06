/*PROBLEM STATEMENT 
Given two arrays A and B of size N and M respectively. The task is to find union between these two arrays.

Union of the two arrays can be defined as the set containing distinct elements from both the arrays. If there are repetitions, then only one occurrence of element should be printed in union.

Example 1:

Input:
5 3
1 2 3 4 5
1 2 3

Output: 
5

Explanation: 
1, 2, 3, 4 and 5 are the
elements which comes in the union set
of both arrays. So count is 5.
Example 2:

Input:
6 2 
85 25 1 32 54 6
85 2 

Output: 
7

Explanation: 
85, 25, 1, 32, 54, 6, and
2 are the elements which comes in the
union set of both arrays. So count is 7.
Your Task:
Complete doUnion funciton that takes a, n, b, m as parameters and returns the count of union elements of the two arrays.The printing is done by the driver code.

Constraints:
1 ≤ N, M ≤ 105
1 ≤ A[i], B[i] < 105

Expected Time Complexity : O((n+m)log(n+m))
Expected Auxilliary Space : O(n+m)
*/
#include<bits/stdc++.h>
using namespace std;
int main()
{
    int i,j,m,n,count1=0,count2=0;
    cin>>m>>n;
    int a[m],b[n];
    for(i=0;i<m;i++)
    {
        cin>>a[i];
    }
    for(j=0;j<n;j++)
    {
        cin>>b[j];
    }
    if(m>n)
    {
        for(i=0;i<m;i++)
        {
            for(j=0;j<n;j++)
            {
                if(a[i]==b[j])
                {
                    count1++;
                }
            }
        }
    }
    cout<<m+n-count1;
    return 0;
}
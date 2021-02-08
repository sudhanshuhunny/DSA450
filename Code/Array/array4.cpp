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
    for(i=0;i<n;i++)
    {
        cin>>a[i];    
    }
    sort(a,a+n);
    for(i=0;i<n;i++)
    {
        cout<<a[i];
    }
    return 0;
}
}
/* GFG APPROACH 
using namespace std;
int main() {

int t;
cin>>t;
while(t--){
		   long long int n;
		   cin>>n;
		   
		   int count0=0;
		   int count1=0;
		   int count2=0;
		   int num;
		   for(long long int i=0;i<n;i++ ){
		   	cin>>num;
		   	if(num==0)
		   			  count0++;
		   	
		   	if(num==1)
		   			  count1++;
			
		   	if(num==2)
		   			  count2++;			 		  
		   			  
		   }
		   
		   while(count0--){
		   	
		   	cout<<"0"<<" ";
		   }
		   
		   while(count1--){
		   	
		   	cout<<"1"<<" ";
		   }
		   
		   while(count2--){
		   	
		   	cout<<"2"<<" ";
		   }

	
	
	cout<<endl;
}


c
	return 0;
}*/

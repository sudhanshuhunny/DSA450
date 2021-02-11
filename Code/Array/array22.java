// Factorials of large numbers 
// Medium Accuracy: 45.51% Submissions: 32947 Points: 4
// Given an integer, the task is to find factorial of the number.
 
// Input:
// The first line of input contains an integer T denoting the number of test cases.  
// The first line of each test case is N,the number whose factorial is to be found
 
// Output:
// Print the factorial of the number in separate line.
 
// Constraints:
// 1 ≤ T ≤ 100
// 1 ≤ N ≤ 1000
 
// Example:
// Input
// 3
// 5
// 10
// 2
 
// Output
// 120
// 3628800
// 2



package Code.Array;

import java.util.ArrayList;
import java.util.Scanner;

class good
{
    // public static void main(String[] args) {
        
    //     Scanner s= new Scanner(System.in);
    //     int t=s.nextInt();
    //     while(t>0){
    //         int n=s.nextInt();
    //         int f=fact(n);
    //         System.out.println(f+" ");
    //         t--;
    //     }
        
    // }

    // Array List method for factorial
    public static void main(String[] args) {
        ArrayList fac=new ArrayList<>();
        Scanner s =new Scanner(System.in);
        int t=s.nextInt();
        int [] f=new int[t];
        for (int i = 0; i < f.length; i++) {
            f[i]=s.nextInt();   
            fac.add(fact(f[i]));
        }
        System.out.println(fac);
        

    }

    public static int fact(int n) {
        if(n==1){
            return n;
        }
        else{
        return n*fact(n-1);
        }
        
        
    }
    
    
    
}
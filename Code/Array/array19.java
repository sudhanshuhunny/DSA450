/*
Common elements 
Easy Accuracy: 38.69% Submissions: 19161 Points: 2
Given three arrays sorted in increasing order. Find the elements that are common in all three arrays.
Note: can you take care of the duplicates without using any additional Data Structure?

Example 1:

Input:
n1 = 6; A = {1, 5, 10, 20, 40, 80}
n2 = 5; B = {6, 7, 20, 80, 100}
n3 = 8; C = {3, 4, 15, 20, 30, 70, 80, 120}
Output: 20 80
Explanation: 20 and 80 are the only
common elements in A, B and C.
 

Your Task:  
You don't need to read input or print anything. Your task is to complete the function commonElements() which take the 3 arrays A[], B[], C[] and their respective sizes n1, n2 and n3 as inputs and returns an array containing the common element present in all the 3 arrays in sorted order. 
If there are no such elements return an empty array. In this case the output will be printed as -1.

 

Expected Time Complexity: O(n1 + n2 + n3)
Expected Auxiliary Space: O(n1 + n2 + n3)

 

Constraints:
1 <= n1, n2, n3 <= 10^5
The array elements can be both positive or negative integers. */

package Code.Array;

import java.util.ArrayList;

import java.util.Collections;
import java.util.Scanner;

public class array19 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int i=0,j=0,k=0;
        int m=s.nextInt();
        int n=s.nextInt();
        int p=s.nextInt();
        ArrayList<Integer> list1= new ArrayList<>();
        ArrayList<Integer> list2= new ArrayList<>();
        ArrayList<Integer> list3= new ArrayList<>();
        ArrayList<Integer> comlist=new ArrayList<>();
        
        
        for ( i = 0; i < m; i++) {
            list1.add(s.nextInt());
        }
        for ( i = 0; i < n; i++) {
            list2.add(s.nextInt());
        }
        for ( i = 0; i < p; i++) {
            list3.add(s.nextInt());
        }
        Collections.sort(list1);
        Collections.sort(list2);
        Collections.sort(list3);
        System.out.println(list1+"\n"+list2+"\n"+list3);
        
        while(i<m && j<n && k<p){
            
            if(list1.get(i)==list2.get(j) && list2.get(j)==list3.get(k) ){
                int e=list1.get(i);
                System.out.println("*");
                comlist.add(e);
                i++;j++;k++;
            }else if(list1.get(i)<list2.get(j)){
                i++;
            }else if(list2.get(j)<list3.get(k)){
                j++;
            }else k++;
        }
        System.out.println(comlist);
        
        
    }
    
}
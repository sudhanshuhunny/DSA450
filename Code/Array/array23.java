// Maximum Product Subarray 
// Easy Accuracy: 29.84% Submissions: 22673 Points: 2
// Given an array Arr that contains N integers (may be positive, negative or zero). Find the product of the maximum product subarray.

// Example 1:

// Input:
// N = 5
// Arr[] = {6, -3, -10, 0, 2}
// Output: 180
// Explanation: Subarray with maximum product
// is  6, -3, -10 which gives product as 180.
// Example 2:

// Input:
// N = 6
// Arr[] = {2, 3, 4, 5, -1, 0}
// Output: 120
// Explanation: Subarray with maximum product
// is 2, 3, 4, 5 which gives product as 120.
// Your Task:
// You don't need to read input or print anything. Your task is to complete the function maxProduct() which takes the array of integers arr and n as parameters and returns an integer denoting the answer.
// Note: Use 64-bit integer data type to avoid overflow.

// Expected Time Complexity: O(N)
// Expected Auxiliary Space: O(1)

// Constraints:
// 1 <= N <= 500
// -102 <= Arri <= 102

package Code.Array;

import java.util.ArrayList;
import java.util.Scanner;

public class array23 {
    // public static void main(String[] args) {
    //     int max_pro=0;
    //     int max_c=0;
        
    //     ArrayList nums=new ArrayList<>();
    //     Scanner s= new Scanner(System.in);
    //     int f=s.nextInt();
    //     for (int i = 0; i < f; i++) {
            
    //         nums.add(s.nextInt());
    //     }
    //     for (int i = 0; i < f; i++) {
    //         int p=max_c  nums.get(i);
    //         max_c=Math.max(nums.get(i),;
    //     }
    // }
    
    public static void main(String[] args) {
    
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int [] nums=new int[n];
        
        for (int i = 0; i < nums.length; i++) {
            nums[i]=s.nextInt();
        }
        
        System.out.println(max_Product(nums,n));
    

    
}

private static int max_Product(int[] nums, int n) {
		int max=nums[0];
        int min=nums[0];
        int ans=nums[0];

       
        for (int i = 1; i < n ; i++) {
            if(nums[i]<0){
                int  swap=min;
                min=max;
                max=swap;
            }
            max=Math.max(nums[i], max*nums[i]);
            min=Math.min(nums[i], min*nums[i]);
            ans=Math.max(max,ans);
        }
        return ans;
        
	}
}
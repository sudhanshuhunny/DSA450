package Code;

import java.util.Arrays;
import java.util.Scanner;

// this program includes linear search , binary search array intialization and max of array

public class concept {

    // Array Intro

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        //int[] nums=new int[5];
        int[] nums ={1,2,6,8,14}; // array is object in case of java
        // for (int i = 0; i <nums.length ; i++) {
        //     nums[i] = s.nextInt();
        // }

        // for (int i = 0; i < nums.length; i++) {
        //     System.out.println(nums);// it will print the hash code for variable i.e stored in memory
        //     System.out.println(nums[i]); // normal printing 
            
        // }
        
        
        System.out.println(Arrays.toString(nums));// to print by this method doesnt work in compi
        //Linear Search to find a element in the array
        int elt =7;
       // int ind =LinearSearch(nums,elt);
       // int ind = binarySearch(nums,elt);
       // System.out.println(ind);    
        System.out.println(maxElement(nums));
    }

    
    
    
    // private static int binarySearch(int[] nums, int elt) {
    //     // Binary Search always works for sorted array not for unsorted array
    //     int start=0;
    //     int end=nums.length-1;
    //     while(start<=end)
    //     {
    //         int mid= (start+end) / 2;
    //         if(nums[mid]== elt)
    //         {
    //             return mid;
    //         }else if(nums[mid]<elt)
    //         {
    //             start=mid+1;
    //         }
    //         else{
    //             end=mid-1;
    //         }


    //     }
        
    //     return -1;
    // }





    // public static int LinearSearch(int[] nums, int elt) {
    //     for (int i = 0; i < nums.length; i++) {
    //         if(nums[i]==elt)
    //         {
    //             return i;
    //         }
            
    //     }
    //     return -1;
    // }





    // Max Elemenht in the array

    public static int maxElement(int[] nums){
        int maxInd=0;
        for (int i = 0; i < nums.length; i++) {
            if(nums[maxInd]<nums[i]){
                maxInd=i;
            }
        }
        return maxInd;
    }

    



    


    
}

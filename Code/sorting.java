package Code;

import java.util.Arrays;
import java.util.concurrent.ForkJoinPool;

public class sorting {
    
public static void main(String[] args) {
    int[] nums ={1,5,2,9,43,26};
    System.out.println(Arrays.toString(nums));
    bubbleSort(nums);
    System.out.println(Arrays.toString(nums));
}

private static void bubbleSort(int[] nums) {

    for (int i = 0; i < nums.length; i++) { // n times 
        for (int j = 0; j < nums.length-1-i; j++) { // n^2-n/2  (worst case - ~n^2)
            if(nums[j]>nums[j+1])
            {
                swap(nums,j,j+1);
            }
        }
        
    }
}

public static void swap(int[] nums , int i , int j) {
   int temp =nums[i];
   nums[i]=nums[j];
   nums[j]=temp;
    
}
    
}

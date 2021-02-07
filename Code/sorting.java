package Code;

import java.util.Arrays;


public class sorting {
    
public static void main(String[] args) {
    int[] nums ={1,5,2,9,43,26,98,55,32,12};
    System.out.println(Arrays.toString(nums));
   // bubbleSort(nums);
    selectionSort(nums);
    System.out.println(Arrays.toString(nums));
}

public static void selectionSort(int[] nums) {
    

    
}


public static int maxElement(int[] nums) {
    int maxInd=0;
    for (int i = 0; i < nums.length; i++) {
        if(nums[maxInd]<nums[i])
        {
            maxInd=i;         
        }
    }
    return maxInd;
}

public static void bubbleSort(int[] nums) {

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

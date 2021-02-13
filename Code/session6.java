package Code;

import java.util.Scanner;



public class session6 {
    public static void main(String[] args) {
    //     // Recursion (function calling Itself)
       Scanner s=new Scanner(System.in);
    //     int n=5; //s.nextInt();
    //     print(n);
    //    // printInc(n);
      
    //    //fact(n);
    //    System.out.println(fact(n));


    //    int [] nums={2,5,6,7,8,9,6,4,6,2,8};
    //    System.out.println(find(nums,5,0));
    // }

    // public static boolean find(int[] nums, int elt, int ind) {
    //     if(ind==nums.length){
    //         return false;
    //     }
    //     if(nums[ind]==elt){
    //         return true;
    //     }
    //     // if(nums[ind]==nums.length){
    //     //     return false;
    //     // } it should not be placed here coz it will make a ind that out of bound to be search

    //     return find(nums,elt,ind+1);

    // }

    // public static int fact(int n) {

    //     if(n==0)
    //     {
    //         return 1;
    //     }
    //     else 
    //     {return n*fact(n-1);}
    // }

    // public static void print(int n) {
    //     if(n==0)
    //     {
    //         return;
    //     } // If not there then it will go till -17705 and boom error
    //     System.out.println(n);
    //     print(n-1);
    // }

    // public static void printInc(int n) {
    //     if(n==0)
    //     {
    //         return;
    //     }
        
    //     printInc(n-1); // Pushing in the Stack
    //     System.out.println(n); // Poping from the stack
        
        
    // Subsequence Recursion tree
    
    String str="abc";
    subseq("",str);



}

private static void subseq(String proc, String unpro_str) {

    if(unpro_str.isEmpty()){
        System.out.println(proc);
        return;
    }
    char ch =unpro_str.charAt(0);
    unpro_str=unpro_str.substring(1); // 1 se leke end tak ki string rhegi 
// upar nya object bnke phla char hatra hai
    subseq(proc+ch,unpro_str);
    subseq(proc,unpro_str);
}   
    
}


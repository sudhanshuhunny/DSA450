package Code;

import java.util.ArrayList;

public class arrayequalsum {
    public static void main(String[] args) {
        int[] nums={1,2,3};
        ArrayList<Integer> first=new ArrayList<>();
        ArrayList<Integer> second=new ArrayList<>();
        eqsum(first, second, 0, 0, nums, 0);
    }
    public static void eqsum(ArrayList<Integer> first,ArrayList<Integer> second, int fsum,int ssum,int[] nums,int index) {
        if(index==nums.length){
            if(fsum==ssum)
            {
                System.out.println(first + " : " + second);
            }
            return;
        }
        int item=nums[index];
        first.add(item);
        eqsum(first, second, fsum+item, ssum, nums, index+1);
        first.remove(first.size()-1);

        second.add(item);
        eqsum(first,second,fsum,ssum+item,nums,index+1);
        second.remove(second.size()-1);


    }

}

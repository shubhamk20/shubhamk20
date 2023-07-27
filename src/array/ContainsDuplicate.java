package array;

import java.util.HashSet;

public class ContainsDuplicate {
    public static void main(String[] args) {
        int numbers[] = {1,2,3,1};
        System.out.println(containsDuplicate(numbers));

    }

    static boolean containsDuplicate(int[] nums) {
        HashSet<Integer> numberSet = new HashSet<Integer>();
        for(int i=0; i<nums.length; i++){
            if(numberSet.contains(nums[i])){
                return true;
            }else{
                numberSet.add(nums[i]);
            }
        }
        return false;
    }
}

package array;

import java.util.HashMap;
import java.util.Map;

public class TwoSum {
    public static void main(String[] args) {
        int nums[] = {2,7,11,15};
        int target = 16;
        int result[] = twoSum(nums, target);
        if(result != null){
            System.out.println(result[0] + " , "+result[1]);
        }
    }

    static int[] twoSum(int[] nums, int target) {
        if(nums.length < 2){
            return null;
        }
        Map<Integer, Integer> sol = new HashMap<Integer, Integer>();
        for(int i=0; i<nums.length ; i++){
            int diff = target - nums[i];
            if(sol.containsKey(diff)){
                return new int[] {i , sol.get(diff)};
            }else{
                sol.put(nums[i], i);
            }
        }
        return null;
    }

}

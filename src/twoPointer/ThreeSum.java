package twoPointer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

// LeetCode 15
// https://leetcode.com/problems/3sum/

public class ThreeSum {
    public static void main(String[] args) {
        int nums[] = {-1,0,1,2,-1,-4};
        List<List<Integer>> result = threeSum(nums);
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
    static List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> result = new LinkedList<List<Integer>>();
        for (int i = 0; i < nums.length - 2; i++) {
            if(i== 0 ||(i>0 && nums[i] != nums[i-1])){
                int target = 0 - nums[i];
                int left = i+1;
                int right = nums.length - 1;
                while(left < right){
                    if(nums[left]+nums[right] == target){
                        List<Integer> currentResult = new ArrayList<Integer>();
                        currentResult.add(nums[i]);
                        currentResult.add(nums[left]);
                        currentResult.add(nums[right]);
                        result.add(currentResult);
                        while(left<right && nums[left] == nums[left+1]){
                            left++;
                        }
                        while(left<right && nums[right] == nums[right-1]){
                            right--;
                        }
                        right--;
                        left++;
                    }else if(nums[left]+nums[right]>target){
                        right--;
                    }else{
                        left++;
                    }
                }
            }
        }
        return result;
    }
    
}

package array;

import java.util.HashSet;
import java.util.Set;

// LeetCode 128
// https://leetcode.com/problems/longest-consecutive-sequence/description/

public class LongestConsecutive {
    public static void main(String[] args) {
        int nums[] = {100,4,200,1,3,2};
        System.out.println(longestConsecutive(nums));
    }

    static int longestConsecutive(int[] nums) {
        if(nums.length == 0){
            return 0;
        }
        Set<Integer> uniqueNum = new HashSet<Integer>();

        for (int i = 0; i < nums.length; i++) {
            uniqueNum.add(nums[i]);
        }

        int ans = 1;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if(!uniqueNum.contains(num-1)){
                int count = 1;
                while(uniqueNum.contains(num+1)){
                    count++;
                    num++;
                }
                ans = Math.max(count, ans);
            }
        }
        return ans;
    }
}

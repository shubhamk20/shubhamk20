package twoPointer;

import java.util.Arrays;

// LeetCode 167
// https://leetcode.com/problems/two-sum-ii-input-array-is-sorted/description/
public class TwoSum {
    public static void main(String[] args) {
        int numbers[] = {2,7,11,15};
        int result[] = twoSum(numbers, 22);
        System.out.println(Arrays.toString(result));
    }

    static int[] twoSum(int[] numbers, int target) {
        int start = 0;
        int end = numbers.length - 1;
        int sum;
        while(start<end){
            sum = numbers[start] + numbers[end];
            if(sum == target){
                return new int[]{ numbers[start],numbers[end]};
                // return new int[]{ start+1,end+1};
            }else if(sum < target){
                start++;
            }else{
                end--;
            }
        }
        return null;
    }
}

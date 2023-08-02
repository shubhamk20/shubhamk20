package array;

import java.util.Arrays;

// LeetCode 238
// https://leetcode.com/problems/product-of-array-except-self/description/
public class ProductExceptSelf {
    public static void main(String[] args) {
        int nums[] = {1,2,3,4};
        int result[] = productExceptSelf(nums);
        System.out.println(Arrays.toString(result));
    }

    static int[] productExceptSelf(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int pre = 1;
        int post = 1;
        for(int i=0; i<nums.length; i++){
            pre *= nums[i];
            left[i] = pre;
        }
        System.out.println(Arrays.toString(left));
        for(int i=nums.length-1; i>=0; i--){
            post *= nums[i];
            right[i] = post;
        }
        System.out.println(Arrays.toString(right));
        nums[0] = 1*right[1];
        nums[nums.length-1] = left[nums.length-2]*1;
        for(int i=1; i<nums.length-1; i++){
            nums[i] = left[i-1]*right[i+1];
        }
        return nums;
    }
}

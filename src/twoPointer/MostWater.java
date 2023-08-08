package twoPointer;

// LeetCode 11
// https://leetcode.com/problems/container-with-most-water/

public class MostWater {
    public static void main(String[] args) {
        int height[] = {1,8,6,2,5,4,8,3,7};
        System.out.println(maxArea(height));
    }

    static int maxArea(int[] height) {
        int left = 0;
        int right = height.length -1;
        int res = 0;
        while(left<right){
            int containerLength = right - left;
            int area = containerLength * Math.min(height[left], height[right]);
            res = Math.max(res, area);
            if(height[left]<height[right]){
                left++;
            }else{
                right--;
            }
        }
        return res;
    }
}

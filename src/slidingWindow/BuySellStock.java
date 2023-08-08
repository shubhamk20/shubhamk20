package slidingWindow;

// LeetCode 121
// https://leetcode.com/problems/best-time-to-buy-and-sell-stock/description/

public class BuySellStock {
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfit(prices));
    }

    static int maxProfit(int[] prices) {
        if(prices.length < 1){
            return 0;
        }
        int left = 0;
        int right = 1;
        int res = 0;
        int max = prices[right] - prices[left];
        while(right < prices.length){
            if(prices[left]<prices[right]){
                max = prices[right] - prices[left];
                res = Math.max(res, max);
                right++;
            }else{
                left = right;
                right++;
            }
        }
        return res;
    }
}

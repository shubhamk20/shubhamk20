package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// LeetCode 347
// https://leetcode.com/problems/top-k-frequent-elements/description/

public class TopFrequentElements {
    public static void main(String[] args) {
        int nums[] = {1,1,1,2,2,3};
        int[] result = topKFrequent(nums, 2);
        System.out.println(Arrays.toString(result));
    }

    static int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> count = new HashMap<>();
        List<Integer> bucket[] = new ArrayList[nums.length + 1];
        for (int num : nums){
            count.merge(num, 1, Integer::sum);
        }
        for(int key: count.keySet()){
            int val = count.get(key);
            if(bucket[val] == null){
                bucket[val] = new ArrayList<>();
            }
            bucket[val].add(key);
        }

        int res[] = new int[k];
        int pos = 0;
        for(int i= nums.length; i>=0 ; i--){
            if(bucket[i] != null){
                for(int val: bucket[i]){
                    res[pos++] = val;
                    if(pos == k){
                        return res;
                    }
                }
            }
        }
        // System.out.println(count);
        
        return null;

    }

}

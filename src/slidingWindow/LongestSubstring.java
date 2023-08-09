package slidingWindow;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

// LeetCode 3
// https://leetcode.com/problems/longest-substring-without-repeating-characters/description/

public class LongestSubstring {
    public static void main(String[] args) {
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static int lengthOfLongestSubstring(String s) {
        List<Character> substring = new ArrayList<Character>();
        int maxLength = 0;
        for (int right = 0; right < s.length(); right++) {
            if(substring.contains(s.charAt(right))){
                int index = substring.indexOf(s.charAt(right));
                substring.remove(index);
                if(index>0){
                    substring.subList(0, index).clear();
                }
            }
            substring.add(s.charAt(right));
            // System.out.println(substring);
            maxLength = Math.max(maxLength, substring.size());
        }

        return maxLength;
    }
}

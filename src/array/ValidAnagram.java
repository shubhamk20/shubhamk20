package array;

// LeetCode 242
// https://leetcode.com/problems/valid-anagram/description/

public class ValidAnagram {
    public static void main(String[] args) {
        String str1 = "anagram";
        String str2 = "nagaram";
        System.out.println(isAnagram(str1, str2));
    }
    static boolean isAnagram(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int alphabate[] = new int[26];
        for(int i=0 ; i<alphabate.length ; i++){
            alphabate[i] = 0;
        }
        for(int i=0; i<s.length(); i++){
            alphabate[s.charAt(i) - 'a'] += 1;
        }
        for(int i=0; i<t.length(); i++){
            alphabate[t.charAt(i) - 'a'] -= 1;
        }
        for(int i=0 ; i<alphabate.length ; i++){
            if(alphabate[i]<0){
                return false;
            }
        }
        return true;
    }
}

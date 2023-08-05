package twoPointer;

// Leetcode 125
// https://leetcode.com/problems/valid-palindrome/description/
public class ValidPalindrome {
    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    static boolean isPalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            
            Character start = s.charAt(i);
            Character end = s.charAt(j);
            
            if (!Character.isLetterOrDigit(start)) {
                i++;
                continue;
            }
            
            if (!Character.isLetterOrDigit(end)) {
                j--;
                continue;
            }
            
            if (Character.toLowerCase(start) != Character.toLowerCase(end)) {
                return false;
            }
            
            i++;
            j--;    
        }
        
        return true;
    }
}

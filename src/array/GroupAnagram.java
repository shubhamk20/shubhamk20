package array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// LeetCode 49

public class GroupAnagram {
    public static void main(String[] args) {
        String strs[] = {"eat","tea","tan","ate","nat","bat"};
        List<List<String>> ga = groupAnagrams(strs);
        for(List<String> st: ga){
            for(String s: st){
                System.out.print("\""+s+"\" ");
            }
            System.out.println();
        }
    }

    static List<List<String>> groupAnagrams(String[] strs) {
        List<List<String>> result = new ArrayList<>();
        HashMap<String, List<String>> anagram = new HashMap<>();
        for(int i=0; i<strs.length; i++){
            char[] str = strs[i].toCharArray();
            Arrays.sort(str);
            String s = String.valueOf(str);
            if(anagram.get(s)!=null){
                List<String> a = anagram.get(s);
                a.add(strs[i]);
                anagram.put(s,a);
            }else{
                List<String> a = new ArrayList<String>();
                a.add(strs[i]);
                anagram.put(s,a);
            }
        }
        // System.out.print(anagram.values());

        for(Map.Entry<String, List<String>> en:anagram.entrySet()){
            result.add(en.getValue());
        }
        return result;
    }
}

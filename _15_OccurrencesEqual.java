/*
Given a string s, return true if s is a "good" string, or false otherwise.
A string s is good if all characters that appear in s have the same number of
occurrences (i.e., the same frequency).

Input (String s)	        Output (true/false)	      Explanation
"aabbcc"	                true	                  All characters (a, b, c) appear 2 times each.
"abcabc"	                true	                  All characters (a, b, c) appear 2 times each.
"aabbbb"	                false	                  a appears 2 times, b appears 4 times.
"xyz"	                    true	                  All characters (x, y, z) appear 1 time each.
"" (empty string)	        true	                  Edge case: No characters → vacuously true.
 */

import java.util.*;
public class _15_OccurrencesEqual {
    public static void main(String args[]){
        String str = "aabbcc";
        HashMap <Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for(char key:map.keySet()){
            System.out.println(key+" : "+map.get(key));
        }
        Collection<Integer> freq = map.values();
        System.out.println(new HashSet<>(freq).size()==1);
        System.out.println(new HashSet<>(freq).size());
    }
}

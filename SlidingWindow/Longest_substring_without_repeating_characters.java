package SlidingWindow;

public class Longest_substring_without_repeating_characters {
    public static void main(String[] args){
        String s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
        s = "bbbbb";
        System.out.println(lengthOfLongestSubstring(s));
        s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
    }
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        if (n <= 1) return n;
        int maxLength = 0, start = 0;
        int[] charIndex = new int[256]; // Initialize all characters as -1
        for (int i = 0; i < n; i++) {
            int index = charIndex[s.charAt(i)];
            if (index >= start) {
                start = index + 1;
            }
            charIndex[s.charAt(i)] = i;
            maxLength = Math.max(maxLength, i - start + 1);
        }
        return maxLength;
    }
}

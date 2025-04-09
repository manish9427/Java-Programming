package SlidingWindow;
import java.util.*;
public class NonRepeatingSubstrings {

    public static void main(String[] args) {
        String word = "pwwkew";
        List<String> nonRepeatingSubstrings = findNonRepeatingSubstrings(word);
        System.out.println("Non-repeating substrings of '" + word + "': " + nonRepeatingSubstrings);
    }

    public static List<String> findNonRepeatingSubstrings(String s) {
        List<String> substrings = new ArrayList<>();
        for (int i = 0; i < s.length(); i++) {
            for (int j = i + 1; j <= s.length(); j++) {
                String substring = s.substring(i, j);
                if (hasUniqueCharacters(substring)) {
                    substrings.add(substring);
                }
            }
        }
        return substrings;
    }

    public static boolean hasUniqueCharacters(String str) {
        Set<Character> charSet = new HashSet<>();
        for (char c : str.toCharArray()) {
            if (!charSet.add(c)) {
                return false; // Duplicate character found
            }
        }
        return true; // All characters are unique
    }
}


/*
str = ?? 
1. First Print all substring
2. Second remove those substring which is having duplicate caracter
3. 
*/ 
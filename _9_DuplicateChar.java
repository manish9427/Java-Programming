// Write a Java Program to find the duplicate characters in a string
import java.util.*;
public class _9_DuplicateChar {
    public static void main(String args[]){
        String str = "Java is a Programming Language";
        String space = str.replaceAll("\\s+","");
        Map<Character,Integer> map = new HashMap<>();
        for(char c : space.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(char key : map.keySet()){
            if(map.get(key) > 1){
                System.out.println(key + " : " + map.get(key)); 
            }
        }

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }
        }
        
    }
}

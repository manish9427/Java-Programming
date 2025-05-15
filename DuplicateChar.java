// Write a Java Program to find the duplicate characters in a string
import java.util.*;
public class DuplicateChar {
    public static void main(String args[]){
        String str = "Java is a Programming Language";
        String space = str.replaceAll("\\s+","");
        Map<Character,Integer> map = new HashMap<>();
        for(char c : space.toCharArray()){
            if(!map.containsKey(c)){
                map.put(c, map.getOrDefault(c,0)+1);
            }else{
                map.put(c, 1);
            }
        }
        for(char key : map.keySet()){
            if(map.get(key) > 1){
                System.out.println(key + " : " + map.get(key));
            }
        }
        
    }
}

package Example;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;

public class ExampleHash {
    public static void main(String[] args) {
        HashMap<Character, Integer> map = new HashMap<>();

        String str = "aaabb";
        char[] ch = str.toCharArray();

        for(char c : ch){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        System.out.println(map);

        Collection <Integer> freq = map.values() ;
        System.out.println(new HashSet(freq));
    }
}

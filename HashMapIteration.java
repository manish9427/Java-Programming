import java.util.*;
public class HashMapIteration {
    public static void main(String args[]){
        String str = "This is going to calculate the String This is going";
        String words[] = str.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word, 0)+1);
        }

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
           System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}

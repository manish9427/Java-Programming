// Write a Java Program to iterate HashMap using While and advance for loop
import java.util.*;
public class _4_HashMapIteration {
    public static void main(String args[]){
        String str = "This is going to calculate the String This is going";
        String words[] = str.split("\\s+");
        HashMap<String,Integer> map = new HashMap<>();
        for(String word : words){
            map.put(word,map.getOrDefault(word, 0)+1);
        }
        for(String key:map.keySet()){
            System.out.print(key + " : " + map.get(key) + "\n");
        }
        System.out.println("Iterating using Advanced for loop");
        for(Map.Entry<String , Integer> entry : map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        System.out.println("Iterating using While loop");
        Iterator<Map.Entry<String,Integer>> iterator = map.entrySet().iterator();
        while(iterator.hasNext()){
            Map.Entry<String , Integer> entry = iterator.next();
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}

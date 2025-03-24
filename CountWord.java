import java .util.* ;
public class CountWord {
    public static void main(String args[]){
        String str = "This is a count of Words";
        String[] words = str.split("\\s+"); // Remove Extra Space

        //Using HashMap
        Map<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        System.out.println(map);
    }
}

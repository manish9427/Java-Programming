import java .util.* ;
public class _3_CountWord {
    public static void main(String args[]){
        String str = "This is a count of Words";

        /*
        String[] words = str.split("\\s+"); 
        Map<String, Integer> map = new HashMap<>();
        for(String word: words){
            map.put(word, map.getOrDefault(word, 0)+1);
        }
        System.out.println(map);         
         */

         wordCount(str);
    }
    public static void wordCount(String str){
        Map<String, Integer> map = new HashMap<>();
        str = str.replaceAll("[^a-zA-Z0-9]"," ").toLowerCase();
        String[] words = str.split("\\s+");
        for(String word:words){
            if(map.containsKey(word)){
                int count = map.get(word);
                map.put(word,count+1);
            }else{
                map.put(word,1);
            }
        }
        System.out.println(map);
        System.out.println(map.keySet());
        System.out.println(map.values());
        System.out.println(map.entrySet());
        for(String key:map.keySet()){
            System.out.println(key + " : " + map.get(key));
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
        for(Map.Entry<String, Integer> entry: map.entrySet()){
            System.out.println(entry);
        }
    }
}

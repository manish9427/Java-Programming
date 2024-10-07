import java.util.HashMap;
import java.util.Map;
public class DuplicateWords_ {
    public static void main(String args[]){
        Map<String ,Integer> map =  new HashMap<>();
        String sentence = "This is a test sentence and this sentence is just a test";
        String [] words = sentence.toLowerCase().split("\\s+");
        for(String word : words){
            map.put(word,map.getOrDefault(word,0)+1);
        }
        System.out.println("Duplicate Word in Senetence: ");
        for(Map.Entry<String,Integer>entry: map.entrySet()){
            if(entry.getValue()>1){
                System.out.println(entry.getKey()+"="+entry.getValue());
            }
        }
    }
}

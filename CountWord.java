import java .util.* ;
public class CountWord {
    public static void main(String args[]){
        String str = "This is a count of Words";
        String[] words = str.split("\\s+"); // Remove Extra Space
        System.out.println(words.length);

        //Using HashMap
        int count = 0;
        Map<String, Integer> wordCount = new HashMap<>();
        for(String word: words){
            wordCount.put(word, wordCount.getOrDefault(word, 0)+1);
            count ++;
        }
        System.out.println(count);
    }
}

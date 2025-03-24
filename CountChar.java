import java.util.*;

class CountChar{
    public static void main(String args[]){
        String str = "Mississippi";
        HashMap<Character, Integer> map = new HashMap<>();
        for(char c : str.toCharArray()){
            map.put(c,map.getOrDefault(c,0)+1);
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > 1) {
            System.out.println(entry.getKey() + " appears " +
           entry.getValue() + " times");
            }
        }
           
    }
}


/*
 String input = "Mississippi";

i appears 4 times
s appears 4 times
p appears 2 times

 */
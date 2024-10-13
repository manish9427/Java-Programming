import java.util.Arrays;
import java.util.HashSet;

public class RemoveDuplicatesInStringArray {
    public static void main(String args[]){
        String[] arr = {"Apple", "Banana", "Apple", "Mango", "Banana"};
        String[] result = removeDuplicates(arr);
        System.out.println(Arrays.toString(result));

    }
    public static String[] removeDuplicates(String[] arr){
        HashSet<String> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }
        String[] newArr = new String[set.size()];
        int index = 0;
        for(String s : set) {
            newArr[index++] = s;
        }
        return newArr;
    }
}

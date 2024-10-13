// remove dupicate element in array

import java.util.HashSet;
import java.util.*;

public class RemoveDuplicatesInArray_ {
    public static void main(String args[]){
        // Integer Array
        int[] arr = {1, 2, 3, 4, 2, 5, 6, 7, 8, 3, 9, 1};
        int [] newArray = removeDuplicates(arr);
        System.out.println(Arrays.toString(newArray));
    }
    public static int[] removeDuplicates(int [] arr){
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<arr.length;i++){
            set.add(arr[i]);
        }

        int newArray [] = new int [set.size()];
        int index = 0;
        for(int num : set ){
            newArray[index++] = num;
        }

        return newArray;
    }
}

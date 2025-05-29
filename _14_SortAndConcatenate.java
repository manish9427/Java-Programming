/*  Write a program that accepts comma-separated strings, sorts the strings in ascending order, 
    and outputs the concatenated string of sorted strings.

    Input: "banana,apple,orange"
    Output: "applebananaorange"
*/

import java.util.*;
public class _14_SortAndConcatenate {
    public static void main(String args[]){
        String str = "banana,apple,orange";
        String[] arr = str.split(",");
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
        String ans = String.join("", arr);
        System.out.println(ans);
    }
}

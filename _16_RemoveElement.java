/*
Problem Statement:

Given an array nums and a value val, remove all instances of val in-place
(without creating a new array) and return the new length of the array.

Constraints:

Must use O(1) extra memory (modify the input array directly).
`
The order of elements can change.
 */

import java.util.*;
public class _16_RemoveElement {
    public static void main(String args[]){
        int[] arr = {1,2,1,3,4,5,6,7,1};
        int val = 1;
        int i=0;
        for(int j=0;j<arr.length;j++){
            if(arr[j]!=val){
                arr[i]=arr[j];
                i++;
            }
        }
        System.out.println(Arrays.toString(Arrays.copyOf(arr, i)));
        // What this method do?
        // It prints the modified array up to the new length.
        System.out.println(i);
    }
}

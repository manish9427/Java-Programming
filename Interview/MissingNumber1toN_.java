/*
 Given an array of numbers from 1 to N, find the missing number. Typically solved using sum formulas or XOR.
 */
public class MissingNumber1toN_ {
    public static void main(String args[]){
        int arr [] = {1,2,4,5};
        int n=5; // largest number in 1 to N
        int sum = n*(n+1)/2;
        int total = 0;
        for(int i=0;i<arr.length;i++){
            total += arr[i];
        }
        int ans = sum-total;
        System.out.println("Missing Number: "+ ans);
    }
}

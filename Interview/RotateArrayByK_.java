/*
Rotate the elements of the array to the right by K positions.

Example: Input: [1, 2, 3, 4, 5], K = 2
Output: [4, 5, 1, 2, 3]
 */
import java.util.Arrays;
public class RotateArrayByK_ {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5};
        int k=2;
        rotate(arr,k);
        System.out.println(Arrays.toString(arr));
    }
    public static void rotate(int arr[],int k){
        int n =arr.length;
        k=k%n; 
        if(k==0){
            return;
        }
        reverseArray(arr,0,n-1);
        reverseArray(arr,0,k-1);
        reverseArray(arr,k,n-1);
    }
    public static void reverseArray(int arr[], int start, int end){
        while(start<end){
            int temp =arr[start];
            arr[start]=arr[end];
            arr[end]=temp;
            start++;
            end--;
        }
    }
}

/*
 Merge two sorted arrays into a single sorted array.

Example: Input: [1, 3, 5], [2, 4, 6]
Output: [1, 2, 3, 4, 5, 6]
 */
public class MergeSortedArray_ {
    public static void main(String args[]){
        int arr1[] = {1, 5, 9, 10, 15};
        int arr2[] = {2, 3, 8, 13};
        int m = arr1.length;
        int n = arr2.length;
        int []  newArray = new int[m+n];
        int i=0,j=0,k=0;
        while(i<m && j<n){
            if(arr1[i]<arr2[j]){
                newArray[k]=arr1[i];
                k++;
                i++;
            }else{
                newArray[k]=arr2[j];
                k++;
                j++;
            }
        }
        while(i<m){
            newArray[k]=arr1[i];
            k++;
            i++;
        }
        while(j<n){
            newArray[k]=arr2[j];
            k++;
            j++;
        }
        for(int ans : newArray){
            System.out.print(ans+" ");
        }
    }
}

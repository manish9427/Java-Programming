import java.util.*;
class FibonacciSeries{
    public static void main(String args[]){
        int n = 5; // 0 1 1 2 3

        // Using DP
        int [] arr = new int[n];
        arr[0] = 0;
        arr[1] = 1;
        for(int i=2;i<n;i++){
            arr[i] = arr[i-1] + arr[i-2]; 
        }
        System.out.println(Arrays.toString(arr));

        // Using Recursion
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
        System.out.println();
    }
    public static int fibonacci(int n) {
        if(n<=1){
            return n;
        }else{
            return fibonacci(n-1)+fibonacci(n-2);
        }
    }

}
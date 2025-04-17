package Revision;

import java.util.Arrays;
public class RevisionFibonacci {
   public static void main(String[] args) {
      int length = 10;
      int[] arr = new int[length];
      arr[0] = 0;
      arr[1] = 1;
      for(int i=2 ; i<length;i++){
         arr[i]=arr[i-1]+arr[i-2];
      }
      System.out.println(Arrays.toString(arr));
   }
}

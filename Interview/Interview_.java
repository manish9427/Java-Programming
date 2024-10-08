import java.util.*;
public class Interview_{
	public static void main(String[] args) {
// ------------Remove Duplicates---------
		// String str = "ManMaiisshh";
		// HashSet<Character> set = new HashSet<>();
		// for(int i=0;i<str.length();i++){
		//     if(!set.contains(str.charAt(i))){
		//         set.add(str.charAt(i));
		//     }
		// }
		// for(Character s : set){
		//     System.out.print(s);
		// }

// -----SubString---------------------------------

		// String str = "Manish";
		// int length = 3;
		// for(int i=0;i<=str.length()-length;i++){
		//     String result = "";
		//     for(int j=i;j<i+length;j++){
		//         result+=str.charAt(j);
		//     }
		//     System.out.println(result);
		// }

// --------SubArray--------------------------------------

		// int[] arr = {1,2,3,4,5,6};
		// int length = 2;
		// for(int i=0;i<arr.length-length;i++){
		//     int[] subArray = new int[length];
		//     for(int j=0;j<length;j++){
		//         subArray[j] = arr[i+j];
		//     }
		//     printArray(subArray);
		// }
// --------------------------Remove Unwanted Character ---------------
		// 		String [] str = {"ma1&*","300","yR4000","%%%..20"};
		// 		// Output = 4321
		// 		int sum = 0;
		// 		for(String s:str) {
		// 			String digit = s.replaceAll("[^0-9]","");
		// 			if(!digit.isEmpty()) {
		// 				sum += Integer.parseInt(digit);
		// 			}
		// 		}
		// 		System.out.println(sum);
// ------------------------------------Spiral Matrix--------------
        // int [][] matrix = {{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        // int top = 0;
        // int bottom = matrix.length-1;
        // int left = 0;
        // int right = matrix[0].length-1;
        
        // while(top<=bottom && left<=right){
        //     for(int i=left;i<=right;i++){
        //         System.out.print(matrix[top][i]+ " ");
        //     }
        //         top++;
        //     for(int i=top;i<=bottom;i++){
        //         System.out.print(matrix[i][right]+" ");
        //     }
        //         right--;
        //     if(top<=bottom){
        //         for(int i=right;i>=left;i--){
        //             System.out.print(matrix[bottom][i]+" ");
        //         }
        //             bottom--;
        //     }
        //     if(left<=right){
        //         for(int i=bottom;i>=top;i--){
        //             System.out.print(matrix[i][left]+" ");
        //         }
        //             left++;
        //     }
        // }
	}
}
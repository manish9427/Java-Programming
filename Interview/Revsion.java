import java.util.*;
public class Revsion
{
	public static void main(String[] args) {
// -------------------Reverse String--------------------
		// 		String str = "Manish";
		// 		String ans = "";
		// 		for(int i=str.length()-1;i>=0;i--){
		// 		   ans +=str.charAt(i);
		// 		}
		// 		System.out.println(ans);

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

// ---------------Fibonacci Series----------
		// 		int n=10;
		// 		int [] arr = new int[n];
		// 		arr[0]=0;
		// 		arr[1]=1;
		// 		for(int i=2; i<n; i++) {
		// 			arr[i]=arr[i-1]+arr[i-2];
		// 		}
		// 		for(int i=0; i<arr.length; i++) {
		// 			System.out.print(arr[i]+" ");
		// 		}

// ----------------------Prime Number---------------------------
		//             int limit =50 ;
		//             for(int num=2;num<=limit;num++){
		//                 if(isPrime(num)){
		//                     System.out.print(num+" ");
		//                 }
		//             }

		// 	}
		// 	public static boolean isPrime(int num){
		// 	    if(num<1){
		// 	        return false;
		// 	    }
		// 	    for(int i=2;i<=Math.sqrt(num);i++){
		// 	        if(num%i==0){
		// 	            return false;
		// 	        }
		// 	    }
		// 	    return true;

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
// ----------------------------missing number for 1 to n-------------------
        // int [] arr = {1,2,3,5,6};
        // int n = arr.length+1;
        // int maxSum = n*(n+1)/2;
        // int sum = 0;
        // for(int i=0;i<arr.length;i++){
        //     sum += arr[i];
        // }
        // int ans = maxSum - sum;
        // System.out.println("Missing Sum: "+ ans);
// -------------------------------------Power of 2-----------------------


        int n = 6;

		if(powerOfTwo(n)){
			System.out.println("Yes");
		}else{
			System.out.println("No");
		}
	}
	public static boolean powerOfTwo(int n){
		if(n<=0){
			return false;
		}
		while(n%2==0){
			n=n/2;
		}	
		return n==1;
	}
}
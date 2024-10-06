/*
 Check whether a number is a power of two. The power of two numbers follows the pattern: 1, 2, 4, 8, 16, etc.
 */
public class PowerOfTwo_ {
    public static void main(String args[]){
        int n= 16;
        if(isPowerOfTwo(n)){
            System.out.println(n + " is a power of two");
        } else {
            System.out.println(n + " is not a power of two");
        }
    }
    public static boolean isPowerOfTwo(int n){
        if(n<=0){
            return false;
        }
        while(n%2==0){
            n=n/2;
        }
        return n==1;

    }  
}

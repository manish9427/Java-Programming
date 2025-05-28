// Write a Java Program to swap two numbers without using the third variable
public class _2_SwapNumber {
    public static void main(String args[]){
        int a = 10;
        int b = 20;
        System.out.println("Before swapping: a = " + a + ", b = " + b);
        a = a+b; 
        b = a-b; 
        a = a-b; 
        System.out.println("After swapping: a = " + a + ", b = " + b);
    }
}

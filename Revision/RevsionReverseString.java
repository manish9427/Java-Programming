package Revision;

public class RevsionReverseString {
    public static void main(String args[]){
        // Single Word
        String str = "Hello";
        String rev = reverseString(str);
        System.out.println("Reversed String: " + rev);
    }
    public static  String reverseString(String str){
        int left = 0;
        int right = str.length()-1;
        char[] charArray = str.toCharArray();
        while(left<right){
            char temp = charArray[left];
            charArray[left]= charArray[right];
            charArray[right] = temp;
            left++;
            right--;
        }
        return new String(charArray);
    }
}

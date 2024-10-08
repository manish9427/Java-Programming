/*
 Check if a string or number is a palindrome (reads the same forward and backward).
 */
public class Palindrome_ {
    public static void main(String args[]){
        String str = "abccba";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not a Plaindrome");
        }
    }
}

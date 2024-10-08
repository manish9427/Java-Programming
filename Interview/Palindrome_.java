/*
 Check if a string or number is a palindrome (reads the same forward and backward).
 */
public class Palindrome_ {
    public static void main(String args[]){

        // - String
        String str = "abccba";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        if(rev.equals(str)){
            System.out.println(str +" is Palindrome");
        }else{
            System.out.println(str + " is Not a Plaindrome");
        }

        //  Number - 
        int num = 121;
        int revNum = 0;
        int originalNum = num;

        while(num>0){
            int digit = num%10;
            revNum = revNum * 10 + digit;
            num = num/10;
        }

        if(revNum==originalNum){
            System.out.println(originalNum + " is Palindrome");
        }else{
            System.out.println(originalNum +" is Not a Plaindrome");
        }
    }
}

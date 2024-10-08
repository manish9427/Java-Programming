/*
 Check if a string or number is a reverse
 */
public class Reverse_ {
    public static void main(String args[]){

        // - String
        String str = "abcde";
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println("Original String: "+str);
        System.out.println("Reverse String: "+rev);

        //  Number - 
        int num = 12345;
        int revNum = 0;
        int originalNum = num;

        while(num>0){
            int digit = num%10;
            revNum = revNum * 10 + digit;
            num = num/10;
        }
        System.out.println("Original Number: "+originalNum);
        System.out.println("Reversed Number: "+revNum);
    }
}

public class _6_PailndromeNumber {
    public static void main(String args[]){
        int num = 121;
        int originalNum = num;
        int rev = 0; 
        while(num!=0){
            int digit = num%10;
            rev = rev*10 + digit;
            num = num/10;
        }
        if(originalNum == rev){
            System.out.println("Palindrome");
        }else{
            System.out.println("Not Palindrome");
        }
    }
}

public class _1_ReverseNumber {
    public static void main(String args[]){
        int num = 123;

        // Using Number of Digits
        /*
        int reversedNum = 0;
        while(num!=0){
            int digit = num % 10;
            reversedNum = reversedNum * 10 + digit;
            num /= 10;
        }
        System.out.println(reversedNum);         
         */

         // Using Convert

         String str = String.valueOf(num);
         // i want to check the type of str
        // String str = Integer.toString(num);
        StringBuilder sb = new StringBuilder();
        for(int i=str.length()-1;i>=0;i--){
            sb.append(str.charAt(i));
        }
        String rev  = sb.toString();
        int reverseNum = Integer.parseInt(rev);
        System.out.println(reverseNum);

    }
}

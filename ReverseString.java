public class ReverseString{
    public static void main(String[] args) {
        String str = "Reverse String";

        // Extra Space 
        /*
        String rev = "";
        for(int i=str.length()-1;i>=0;i--){
            rev += str.charAt(i);
        }
        System.out.println(rev);
         */

         //In Place
         int left = 0;
         int right = str.length()-1;
         char [] rev = str.toCharArray();
         while(left<right){
            char temp = rev[left];
            rev[left]=rev[right];
            rev[right]=temp;
            left++;
            right--;
         }
         System.out.println(String.valueOf(rev));

    }
}
public class Palindrome{
    public static void main(String args[]){
        String str = "OYO";
        int left = 0;
        int right = str.length()-1;
        while(left<right){
            if(str.charAt(left)!= str.charAt(right)){
                System.out.println(str+" is Not a valid Palindrome");
            }
            left++;
            right--;
        }
        System.out.println(str+" is a valid Palindrome");
    }
}
import java.util.*;
public class Anagram_{
    public static void main(String args[]){
        String str1 = "Manish";
        String str2 = "Man ish";
         if(isAnagram(str1,str2)){
            System.out.println("Anagram");
         }else{
            System.out.println("Not a Anagram");
         }
    }
    public static boolean isAnagram(String str1,String str2){
        str1 = str1.replaceAll("\\s", "").toLowerCase();
        str2 = str2.replaceAll("\\s", "").toLowerCase();

        if(str1.length() != str2.length()){
            return false;
        }

        char[] charArray1 = str1.toCharArray();
        char[] charArray2 = str2.toCharArray();

        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        return Arrays.equals(charArray1, charArray2);
    }
}
// Write a Java Program to remove all white spaces from a string without using replace()

public class RemoveWhiteSpace {
    public static void main(String args[]){
        String str = "        Man    \t                       Verma    \n      ";
        String ans = str.replace("Man","Manish"); 
        System.out.println(ans);
        String ss = ans.replaceAll("\\s+"," "); 
        System.out.println(ss);
    }
}

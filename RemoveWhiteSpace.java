// Write a Java Program to remove all white spaces from a string without using replace()

public class RemoveWhiteSpace {
    public static void main(String args[]){
        String str = "        Man    \t                       Verma    \n      ";
        String ans = str.replace("Man","Manish"); 
        System.out.println(ans);
        String ss = ans.replaceAll("\\s+"," "); 
        System.out.println(ss);
        System.out.println(removeWhiteString(ans));
    }
    public static String removeWhiteString(String ans){
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < ans.length(); i++){
            char ch = ans.charAt(i);
            if(ch != ' ' && ch != '\t' && ch != '\n'){
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}

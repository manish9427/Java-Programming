public class RemoveWhiteSpace {
    public static void main(String args[]){
        String str = "Man ish";
        String ans = str.replace("Man","Nam"); // O(n)
        System.out.println(ans);
        String s = "Manish 123 Verma";
        String ss = s.replaceAll("\\d+",""); 
        System.out.println(ss);
        String text = "   Hello, world!   ";
        String trimmedText = text.trim();
        System.out.println(trimmedText); 

    }
}

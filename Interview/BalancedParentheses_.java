import java.util.Stack;
public class BalancedParentheses_{
    public static void main(String args[]){
        String str = "{[()]}";
        System.out.println(str+" : "+(isBalanced(str)?"Balanced":"Not Balanced"));
    }
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(ch=='['||ch=='{'||ch=='('){
                st.push(ch);
            }else if(ch==')'||ch=='}'||ch==']'){
                if(st.isEmpty()){
                    return false;
                }
                char top = st.pop();
                if(ch==']'&&top!='['||ch=='}'&&top!='{'||ch==')'&&top!='('){
                    return false;
                }
            }
        }
        return st.isEmpty();
    }
}
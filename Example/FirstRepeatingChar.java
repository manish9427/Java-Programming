package Example;
// Input str = "jaaabb"
// Output = "a"

public class FirstRepeatingChar {
    public static void main(String args[]){
        String str = "jaaabb";
        char result = firstRepeatingChar(str);
        System.out.println("First repeating character: " + result);
    }
    public static char firstRepeatingChar(String str){
        char[] charArray = str.toCharArray();
        int count = 0;
        for(int i=0;i<charArray.length;i++){
            for(int j=i+1;j<charArray.length;j++){
                if(charArray[i]==charArray[j]){
                    count++;
                    if(count ==1){
                        return charArray[i];
                    }
                }
            }
        }
        return ' ';
    }
}

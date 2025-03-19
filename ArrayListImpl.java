import java.util.*;
public class ArrayListImpl {
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);

        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }
        
    }
}

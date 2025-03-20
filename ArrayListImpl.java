import java.util.*;
public class ArrayListImpl {
    public static void main(String args[]){
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);

        System.out.println("Using For Loop");
        for(int i=0;i<al.size();i++){
            System.out.println(al.get(i));
        }

        System.out.println("Using While Loop");
        int j=0;
        while(j<al.size()){
            System.out.println(al.get(j));
            j++;
        }

        System.out.println("Using Advanced loop");
        for(Integer i:al){
            System.out.println(i);
        }
        
    }
}

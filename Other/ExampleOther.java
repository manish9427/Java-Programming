package Other;

public class ExampleOther {

    int a = 10;
    static public void fun(){
        ExampleOther obj = new ExampleOther();
        int b = 10;
        System.out.println(obj.a + " " + b);
        obj.a++;
        b++;
    } 
    public static void main(String args[] ){
        // ExampleOther obj = new ExampleOther();
        ExampleOther.fun();
        ExampleOther.fun();
    }
}








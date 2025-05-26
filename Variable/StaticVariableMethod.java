public class StaticVariableMethod {
    static int b =10;
    void display(){
        int a = 10;
        System.out.println(b+" "+ a);
        b++;
        a++;
    }
    public static void main(String args[]){
        StaticVariableMethod ref  = new StaticVariableMethod();
        ref.display();
        ref.display();
    }
}

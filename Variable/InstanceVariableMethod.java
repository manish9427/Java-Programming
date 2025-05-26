public class InstanceVariableMethod {
    int b = 10;  // Instance variable (each object gets its own copy)

    void display() {
        int a = 10;  // Local variable (created fresh every time)
        System.out.println(b + " " + a);
        b++;  // Instance variable is incremented
        a++;  // Local variable is incremented (but change discarded)
    }

    public static void main(String[] args) {
        InstanceVariableMethod ref = new InstanceVariableMethod();
        ref.display();  // First call
        ref.display();  // Second call
    }
}

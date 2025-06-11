package FunctionalInterface;

@FunctionalInterface
interface A{
    void method();
}

public class FunctionalInterfaceExample1 {
    public static void main(String[] args) {
        A obj = () -> System.out.println("Functional Interface Example");
        obj.method();
    }
}

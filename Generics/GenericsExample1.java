package Generics;

class Container<T> {
    T value;
}

public class GenericsExample1 {
    public static void main(String[] args) {
        Container<String > container = new Container<>();
        container.value = "Hello, Generics!";
        System.out.println("Container value: " + container.value);
    }
}

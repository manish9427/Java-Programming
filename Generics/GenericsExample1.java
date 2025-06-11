package Generics;

class Container<T extends Number> {
    T value;
}

public class GenericsExample1 {
    public static void main(String[] args) {
        Container<Integer> container = new Container<>();
        container.value = 5;
        System.out.println("Container value: " + container.value);
    }
}

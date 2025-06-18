package Interface_Abastract_class;

interface A{
    void method1 ();
}

class B implements A{
    public void method1() {
        System.out.println("Method1 from class B");
    }
}
public class InterfaceExample1 {
    public static void main(String[] args) {
        A a = new B();
        a.method1();
    }
}



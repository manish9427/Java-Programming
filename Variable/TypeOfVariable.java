class TypeOfVariable{
    static int b = 20; // Instatnce
    int c = 30; // Instance
    public static void main(String args[]){
        int a = 10; // Local
        TypeOfVariable ref = new TypeOfVariable();
        System.out.println(a);
        System.out.println(TypeOfVariable.b);
        System.out.println(ref.c);
    }
} 
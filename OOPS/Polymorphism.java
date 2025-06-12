package Oops;

interface Mouth {
    public void perform();
}

class Talk implements Mouth{
    @Override
    public void perform(){
        System.out.println("Perform Talk Operation");
    }
}

class Cut implements Mouth{
    @Override
    public void perform(){
        System.out.println("Perform Cut Operation");
    }
}

public class Polymorphism {
    public static void main(String args[]){
        Mouth mouth;

        mouth = new Talk();
        mouth.perform();

        Cut cut = new Cut();
        mouth = cut;
        mouth.perform();


    }
}

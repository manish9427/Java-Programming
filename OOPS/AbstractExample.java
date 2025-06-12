package Oops;

public class AbstractExample {

    abstract class InterviewBit{ 
        public abstract void printMessage(); 
    } 

    class ScalarAcademy extends InterviewBit{ 
        public void printMessage(){ 
            System.out.println("Welcome to Scalar Academy By InterviewBit"); 
        } 
    } 

    class ScalarTopics extends ScalarAcademy{ 
        public void printMessage(){ 
            System.out.println("Welcome to Scalar Topics By Scalar Academy"); 
        } 
    }

    public static void main(String[] args) { 
        AbstractExample ae = new AbstractExample();  
        InterviewBit ib = ae.new ScalarTopics(); 
        ib.printMessage();  
    }    
}

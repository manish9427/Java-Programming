package Oops;

public class InterfaceExample {
    interface InterviewBit {
        void printMessage();
    }

    static class ScalarAcademy implements InterviewBit {
        public void printMessage() {
            System.out.println("Welcome to Scalar Academy By InterviewBit");
        }
    }

    static class ScalarTopics extends ScalarAcademy {
        public void printMessage() {
            System.out.println("Welcome to Scalar Topics By Scalar Academy");
        }
    }

    public static void main(String[] args) {
        InterviewBit ib = new ScalarTopics(); // No outer class instance needed
        ib.printMessage();
    }
}

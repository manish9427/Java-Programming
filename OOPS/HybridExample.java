public class HybridExample {

    interface InterviewBit {
        void printMessage();  // Interface method
    }

    abstract class ScalarAcademy implements InterviewBit {
        public void printMessage() {
            System.out.println("Welcome to Scalar Academy By InterviewBit");
        }

        // Abstract method specific to ScalarAcademy
        public abstract void courseType();
    }

    class ScalarTopics extends ScalarAcademy {
        @Override
        public void printMessage() {
            System.out.println("Welcome to Scalar Topics By Scalar Academy");
        }

        @Override
        public void courseType() {
            System.out.println("This is a DSA and System Design Course.");
        }
    }

    public static void main(String[] args) {
        HybridExample he = new HybridExample();
        InterviewBit ib = he.new ScalarTopics();  // Dynamic binding
        ib.printMessage();  // Calls ScalarTopics implementation

        System.out.println();

        // Accessing through abstract class reference
        ScalarAcademy sa = he.new ScalarTopics();
        sa.printMessage();   // ScalarTopics version
        sa.courseType();     // ScalarTopics version
    }
}

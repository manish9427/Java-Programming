class SharedObj{
    private volatile boolean  flag = false;
    public void setFlagTrue(){
        System.out.println("Setting flag to true");
        flag = true;
    }
    public void printIfFlagTrue(){
        while(!flag){

        }
        System.out.println("Flag is true!");
    }
}

public class VolatileExample2 {
    public static void main(String[] args) {
        SharedObj obj = new SharedObj();
        Thread writerThread = new Thread(()->{
            try{
                Thread.sleep(1000);
            }catch(InterruptedException e){
                Thread.currentThread().interrupt();
            }
            obj.setFlagTrue();
        });
        Thread readerThread = new Thread(()->{obj.printIfFlagTrue();});
        writerThread.start();
        readerThread.start();
    }
}


package Keyword;


public class VolatileExample { 

    private volatile boolean flag = true; 

  

    public void run() { 

        while (flag) { 

            // do work 

        } 

    } 

  

    public void stop() { 

        flag = false; 

    } 

} 

 
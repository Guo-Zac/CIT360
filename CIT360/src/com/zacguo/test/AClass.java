package com.zacguo.test;

public class AClass {

}

public static class HelloRunnable implements Runnable {

    public void run() {
        System.out.println("Hello from a thread!");
    }

    public static void main(String args[]) {
        (new Thread(new HelloRunnable())).start();
        
        
   //     Callable<Integer> task = () ->
        
        
    }

}
package com.multithreading;

public class MyRunnable implements  Runnable{
    @Override
    public void run() {
        System.out.println("Thread is running by implementing Runnable interface");
    }

    public static void main(String[] args) {
        Thread t = new Thread(new MyRunnable());
        MyRunnable t1 = new MyRunnable();
        t1.run();
        t.start();

    }
}

package com.multithreading;

public class MyThread extends Thread{

//    @Override
//    public void run() {
//        System.out.println("Thread is running.");
//    }
    @Override
    public void run() {
        try {
            System.out.println("Thread is running....");
            Thread.sleep(3000);
            System.out.println("Thread after sleep....");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {
        Thread t1 = new MyThread();
        System.out.println("New Thread...");
        t1.start();
        Thread.sleep(2000);
        System.out.println("After start method run....");
    }
}

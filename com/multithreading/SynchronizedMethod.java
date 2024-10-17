package com.multithreading;

public class SynchronizedMethod implements  Runnable{
    private Counter counter;
    SynchronizedMethod(Counter counter){
        this.counter = counter;
    }
    @Override
    public void run() {
      for (int i = 0; i<1000; i++){
          counter.increament();
      }
    }


    public static void main(String[] args) {
       Counter counter  = new Counter();
       Thread t1 = new Thread(new SynchronizedMethod(counter));
       Thread t2 = new Thread(new SynchronizedMethod(counter));
       Thread t3 = new Thread(new SynchronizedMethod(counter));

        t1.start();
        t2.start();
        t3.start();
        System.out.println("get counter before join  " + counter.getCount());
       try {
          t2.join();
           t1.join();
           t3.join();
       } catch (Exception e){
           e.printStackTrace();
       }
         int id = Math.toIntExact(t1.getId());
        System.out.println("get counter  " + counter.getCount());
        System.out.println("t1 name  "+t1.getName()  +" "+ t1.getPriority());
        System.out.println("t2 name  "+t2.getName()+" "+ t2.getPriority());
        System.out.println("t3 name  "+t3.getName() +" "+ t3.getPriority());

    }
}

class Counter{
    private int count = 0;
    public synchronized void increament(){
        count++;
    }

    public void setCount(int count) {
        this.count = count;
    }
    public int getCount(){
        return count;
    }
}

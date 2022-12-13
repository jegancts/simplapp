package Multithreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReadWriteLock;
import java.util.concurrent.locks.ReentrantReadWriteLock;

public class SyncExample {

    public static void main(String[] args) {
        Sample1 s1 = new Sample1();
        s1.setCount(10);
        myrunnable t1 = new myrunnable(s1);
        t1.start();
        myrunnable t2 = new myrunnable(s1);
        t2.start();

        try {
            t1.join();
            t2.join();
        }
        catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(s1.getCount());

    }
}

class myrunnable extends Thread {
    Sample1 s ;
    public  myrunnable(Sample1 s) {
        this.s = s;
    }

    @Override
    public void run() {
        System.out.println( Thread.currentThread().getName() );

            s.increment();

        // System.out.println(y);
    }
}

class Sample1 {

    private int count;

    ReadWriteLock RW_Lock = new ReentrantReadWriteLock();



    public void increment() {

        Lock locks = RW_Lock.writeLock();

        locks.lock();
        try {
            int y = getCount();
            y++;
            setCount(y);
        }
        catch(Exception e) {
            e.printStackTrace();
        }
        finally {
            locks.unlock();
        }

    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}
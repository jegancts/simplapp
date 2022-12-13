package Multithreading;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ForkJoinPool;

public class MultSample1 implements Runnable{


    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

class main1 {

    public static void main(String[] args) {

//        MultSample1 sam = new MultSample1();

        ExecutorService service = Executors.newFixedThreadPool(4);
       for(int i = 0 ; i < 4 ;i++) {
           service.execute(new MultSample1());
//        sam1.start();
       }
    }
}
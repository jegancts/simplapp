package DataStructures;

import lombok.SneakyThrows;

import java.util.Random;
import java.util.concurrent.ArrayBlockingQueue;

import java.util.concurrent.BlockingQueue;

public class ProducerConsumer1 {

   private static BlockingQueue<Integer> queue = new ArrayBlockingQueue<>(5);


    public static void main(String[] args) throws InterruptedException {

    Thread obj1 = new Thread(()-> {

        try {
            processor();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    });

        Thread obj2 = new Thread(() -> {
            try {
                consumer();
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });


        obj1.start();
        obj2.start();
        Thread.sleep(300);
        System.exit(0);
    }



    private static void processor() throws InterruptedException {

        Random random = new Random();

        while(true) {
            int value = random.nextInt();
            queue.put(value);
            System.out.println("produce :" + value + "thread name : " + Thread.currentThread().getName());
        }

    }

    private static void consumer() throws InterruptedException {
        while(true) {
            int value = queue.take();
            System.out.println("value : " + value + Thread.currentThread().getName());
        }
    }
}

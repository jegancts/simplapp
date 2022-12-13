package DataStructures;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer2 {

    public static void main(String[] args) {
        MyblockingQueue myblockingQueue = new MyblockingQueue();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Random random = new Random();
        for(int i = 0; i < 10 ; i++) {
            int finalI = i;
            executorService.submit(()-> {
                myblockingQueue.add(finalI);
            });
        }

        for(int i = 0; i < 10 ; i++) {
            int finalI = i;
            executorService.submit(()-> {
              int value = (int) myblockingQueue.remove(finalI);
              System.out.println("value : " + value + Thread.currentThread().getName());
            });
        }


    }

}

class MyblockingQueue<E> {

    private ReentrantLock lock = new ReentrantLock();
    private Condition Queue_Full = lock.newCondition();
    private Condition Queue_Empty = lock.newCondition();


    public Queue<E> queue;
    public int max = 10;

    public  MyblockingQueue() {
        this.queue =  new LinkedList<>();
        this.max = max;
    }

    public void add(E e) {

        //add lock
        lock.lock();

        try {
            if(queue.size() == max) {
                Queue_Full.await();
            }
                queue.add(e);

            System.out.println("Added : " + e);

            Queue_Empty.signalAll();
            //    System.out.println(queue.peek());

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } finally {
            //release lock
            lock.unlock();
        }
    }

    public E remove(E e) {

        //add lock
        lock.lock();
        try {
            if(queue.size() == 0 ) {
                Queue_Empty.await();
            }
            queue.remove();
            System.out.println("Removed : " + e);
            Queue_Full.signalAll();

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        } finally {
            //release lock
            lock.unlock();
        }

        return e;
    }
}

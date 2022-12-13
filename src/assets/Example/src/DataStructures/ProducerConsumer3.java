

package DataStructures;

        import java.util.LinkedList;
        import java.util.Queue;
        import java.util.Random;
        import java.util.concurrent.ExecutorService;
        import java.util.concurrent.Executors;
        import java.util.concurrent.locks.Condition;
        import java.util.concurrent.locks.ReentrantLock;

public class ProducerConsumer3 {

    public static void main(String[] args) {
        MyblockingQueue1 myblockingQueue1 = new MyblockingQueue1();
        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Random random = new Random();
        for(int i = 0; i < 10 ; i++) {
            int finalI = i;
            executorService.submit(()-> {
                myblockingQueue1.add(finalI);
            });
        }

        for(int i = 0; i < 10 ; i++) {
            int finalI = i;
            executorService.submit(()-> {
                int value = (int) myblockingQueue1.remove(finalI);
                System.out.println("value : " + value + Thread.currentThread().getName());
            });
        }


    }

}

class MyblockingQueue1<E> {


   private Object Queue_Full = new Object();
    private Object Queue_Empty = new Object();


    public Queue<E> queue;
    public int max = 10;

    public  MyblockingQueue1() {
        this.queue =  new LinkedList<>();
        this.max = max;
    }

    public synchronized void add(E e) {

        //add lock


        try {
            if(queue.size() == max) {
                Queue_Full.wait();
            }
            queue.add(e);

            System.out.println("Added : " + e);

            Queue_Empty.notify();
            //    System.out.println(queue.peek());

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }

    }

    public  synchronized E remove(E e) {
        try {
            if(queue.size() == 0 ) {
                Queue_Empty.wait();
            }
            queue.remove();
            System.out.println("Removed : " + e);
            Queue_Full.notify();

        } catch (InterruptedException interruptedException) {
            interruptedException.printStackTrace();
        }


        return e;
    }
}


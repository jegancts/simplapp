
    import java.util.concurrent.CountDownLatch;

public class CountDownLatchExample {
    public static void main(String args[]) {
        //Set the counter to 2 being two applications
        CountDownLatch countDownLatch = new CountDownLatch(4);

        Thread app1 = new Thread(new Application("App1",  countDownLatch));
        Thread app2 = new Thread(new Application("App2",  countDownLatch));
        Thread app3 = new Thread(new Application("App3",  countDownLatch));
        Thread app4 = new Thread(new Application("App4",  countDownLatch));

        // initialize applications
        app1.start();
        app2.start();
        app3.start();
        app4.start();

        try {
            //wait until countDownLatch reduces to 0.
            countDownLatch.await();
            //As all applications are up, print the message
            System.out.println("All applications are up and running.");
        } catch(InterruptedException e) {
            System.out.println(e.getMessage());
        }
    }
}

class Application implements Runnable {
    private String name;
    private CountDownLatch countDownLatch;

    public Application(String name, CountDownLatch countDownLatch) {
        this.name = name;
        this.countDownLatch = countDownLatch;
    }

    public void run() {
        try {
            System.out.println(name + " started. ");
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println(e.getMessage());
        }
        System.out.println( name + " is Up and running.");
        //reduce the count by 1
        countDownLatch.countDown();
    }
}
//    This will produce the following result −
//
//        Output
//        App2 started.
//        App3 started.
//        App1 started.
//        App4 started.
//        App1 is Up and running.
//        App3 is Up and running.
//        App4 is Up and running.
//        App2 is Up and running.
//        All applications are up and running.

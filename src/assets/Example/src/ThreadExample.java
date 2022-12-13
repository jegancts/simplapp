import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.stream.IntStream;

public class ThreadExample {

    public static void main(String args[]) {

        print t1 = new print();
        t1.start();
        ThreadPrint t2 = new ThreadPrint();
        Thread t3 = new Thread(t2);
        t3.start();
    }
}

class print extends Thread{

    @Override
    public void run() {
        System.out.println("test thread");
    }
}

class ThreadPrint implements Runnable{

    @Override
    public void run() {
        System.out.println("test runnable");
    }
}

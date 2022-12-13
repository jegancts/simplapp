import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;

public class ThreadExecuter {

    public static void main(String[] args) {
        int a = 10;
        int b = 12;
        AddNumbers addNumbers = new AddNumbers(a, b);
        ExecutorService executorService = Executors.newFixedThreadPool(5);
        executorService.execute(addNumbers);

    }
}


class AddNumbers implements Runnable {
    int a, b;

    AddNumbers(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public void run() {
        int c = a + b;
        System.out.println(c);

    }

}

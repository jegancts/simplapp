



        import java.io.File;
        import java.io.IOException;
        import java.util.List;
        import java.util.concurrent.CompletableFuture;
        import java.util.concurrent.ExecutionException;
        import java.util.concurrent.Executor;
        import java.util.concurrent.Executors;

public class RunAsyncDemo {



    public Void saveEmployeesWithCustomExecutor() throws ExecutionException, InterruptedException {

        Executor executor = Executors.newFixedThreadPool(5);
        CompletableFuture<Void> runAsyncFuture = CompletableFuture.runAsync(
                () -> {
                    try {

                        System.out.println("Thread : " + Thread.currentThread().getName());
                       for(int i =0; i<10000;i++) {
                           if(i == 9999) {
                               System.out.println("I am done : " + Thread.currentThread().getName());
                           }
                       }

                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                },executor);

        return runAsyncFuture.get();
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        RunAsyncDemo runAsyncDemo = new RunAsyncDemo();
        runAsyncDemo.saveEmployeesWithCustomExecutor();

    }
}

import java.util.concurrent.*;

public class MultiplyNumbers {

    private static int mulitply(int a, int b) throws ExecutionException, InterruptedException {
        return a * b;
    }

    public static void main(String args[] ) throws ExecutionException, InterruptedException {

            ExecutorService executorService = Executors.newFixedThreadPool(1);
            Future<Integer> future = executorService.submit(
                    new Callable<Integer>() {
                        @Override
                        public Integer call() throws Exception {
                            return mulitply(4,5);
                        }
                    }
            );

            while(! future.isDone());
            int z = future.get();

            System.out.println("output :"+ z);

        }
    }



public class ThreadAddNumber {

    public static void main(String args[]) throws InterruptedException {
        int a = 5;
        int b = 9;
        AddNumber addNumber = new AddNumber(a,b);
        Thread t1 = new Thread(addNumber);
        t1.start();
        Thread t2 = new Thread(addNumber);
        t2.start();

        new Thread(new AddNumber(7,8)).start();

        try {
            t1.join();
            t2.join();
        }
        catch(Exception ex) {
            ex.printStackTrace();
        }
    }
}

class AddNumber implements Runnable {
    int arg1,arg2;
    AddNumber(int arg1, int arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }

    @Override
    public void run() {

        int arg3 = arg1 + arg2;
        System.out.println(arg3);

    }
}



class Singleton {

    public static Object object= new Object();
    private static Singleton instance = null;
    private Singleton(){};
    public static  Singleton getInstance() {
        if (instance != null) {
            return instance;
        }

        synchronized (object) {

            if (instance == null) {
                instance = new Singleton();
            }

            return instance;
        }

    }
}

public class SingletonTest {

    public static void main(String[] args) {

        Singleton s1 = Singleton.getInstance();
        Singleton s2 = Singleton.getInstance();
        Singleton s3 = Singleton.getInstance();

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

    }

}

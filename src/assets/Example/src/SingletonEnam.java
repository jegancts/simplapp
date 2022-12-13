public class SingletonEnam {

    public static void main(String[] args) {
        Singleton1 s1 = Singleton1.INSTANCE;
        Singleton1 s2 = Singleton1.INSTANCE;
        Singleton1 s3 = Singleton1.INSTANCE;

        System.out.println(s1.hashCode());
        System.out.println(s2.hashCode());
        System.out.println(s3.hashCode());

    }
}

enum Singleton1 {
    INSTANCE;

//    private String value;
//
//    public void setValue(String value) {
//        this.value = value;
//    }
//
//    public String getValue() {
//        return value;
//    }
}

class parent {
    public void method1() {
        System.out.println("I am child");
    }

    public void method2(){
        System.out.println("I am parent super");
    }
}

class child1 extends parent{

    @Override
    public void method1() {
        System.out.println("I am child1");
    }

    public void method3() {
        super.method2();
    }
}

class child2 extends child1{
    @Override
    public void method1() {
        System.out.println("I am child2");
    }
}

public class OverridingExample {
    public static void main(String[] args) {
        parent p1 = new child2();
        p1.method1();

        child1 p2 = new child1();
        p2.method3();


    }
}


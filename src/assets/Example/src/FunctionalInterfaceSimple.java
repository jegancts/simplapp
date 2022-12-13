
@FunctionalInterface
public interface FunctionalInterfaceSimple {
    public void print(String name);
}


class TestPrint{
    public static void main(String[] args) {
//        FunctionalInterfaceSimple s = new FunctionalInterfaceSimple() {
//            @Override
//            public void print() {
//                System.out.println("test");
//            }
//        };
//        s.print();

        FunctionalInterfaceSimple s1  = (name) -> System.out.println("wlecome" + name);
        s1.print("Jegan");

    }
}

public final class ImmutableClass {

    private static String name = "Jegan";
    private static long Age = 23;

    ImmutableClass() {}
    public ImmutableClass(String name, long Age) {
        this.name = name;
        this.Age= Age;
        System.out.println("Immutable class called");
    }

    public String getName() {
        return name;
    }

    public long getAge() {
        return Age;
    }
}

class main {
    public static void main(String[] args) {
        ImmutableClass im = new ImmutableClass("Rani", 45);

        System.out.println(im.getAge());
        System.out.println(im.getName());
    }
}

import java.util.Scanner;

public class Recursion {

    private static int i;
    private static int n;

    public static void main(String[] args) {
        Scanner scanner1 = new Scanner(System.in);
        n = scanner1.nextInt();
        calculate();

    }

    static void calculate() {
        if (i < n) {
            //  System.out.printf("%d", i++);
            System.out.println(i++);
            calculate();

        }
    }
}

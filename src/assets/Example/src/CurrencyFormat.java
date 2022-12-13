import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class CurrencyFormat {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double payment = scanner.nextDouble();
        scanner.close();

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        System.out.println(formatter.format(payment));
        String us = formatter.format(payment);

        float amt  = 10000;

        Format formatter1 = NumberFormat.getCurrencyInstance(new Locale("en","IN"));
        System.out.println(formatter1.format(amt));


        NumberFormat formatter2 = NumberFormat.getCurrencyInstance(Locale.CHINA);
        System.out.println(formatter2.format(payment));
        String china = formatter2.format(payment);

        NumberFormat formatter3 = NumberFormat.getCurrencyInstance(Locale.FRANCE);
        String france = formatter3.format(payment);

        System.out.println("US: " + us);
//        System.out.println("India: " + india);
        System.out.println("China: " + china);
        System.out.println("France: " + france);

        // Write your code here.
//
//        System.out.println("US: " + us);
//        System.out.println("India: " + india);
//        System.out.println("China: " + china);
//        System.out.println("France: " + france);
    }
}

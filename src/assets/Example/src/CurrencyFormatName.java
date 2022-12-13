
import java.text.NumberFormat;
        import java.util.Locale;
        import java.util.Currency;

public class CurrencyFormatName {
    public static void main(String[] args)
            throws Exception
    {

        // Get the currency instance
        NumberFormat nF
                = NumberFormat
                .getCurrencyInstance();

        // Stores the values
        String values
                = nF.getCurrency()
                .getDisplayName();

        // Prints the currency
        System.out.println(values);


        NumberFormat nF1
                = NumberFormat
                .getCurrencyInstance(
                        Locale.CANADA);

        // Stores the values
        String values1
                = nF1.getCurrency()
                .getDisplayName();

        // Prints the currency
        System.out.println(values1);

    }
}

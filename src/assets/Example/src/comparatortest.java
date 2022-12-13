class Complex {

    private String re, im;

    public Complex(String re, String im) {
        this.re = re;
        this.im = im;
    }

    // Overriding equals() to compare two Complex objects
    @Override
    public boolean equals(Object o) {
        Complex c = (Complex) o;
        return CharSequence.compare(re, c.re) == 0
                && CharSequence.compare(im, c.im) == 0;
    }
}

// Driver class to test the Complex class
public class comparatortest {

    public static void main(String[] args) {
        Complex c1 = new Complex("Jega", "Jegan");
        Complex c2 = new Complex("Jega", "Jegan");
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}

import java.io.*;
        import java.util.*;
        import java.text.*;
        import java.math.*;
        import java.util.regex.*;

public class ArrayString {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int t = s.nextInt();
        String [] pair_left = new String[t];
        String [] pair_right = new String[t];

        for (int i = 0; i < t; i++) {
            pair_left[i] = s.next();
            pair_right[i] = s.next();
        }
        int count = 0;
        for (int j = t -1 ; j >= 0 ; j--) {
            for (int i = j -1 ; i >= j ; i--) {
                if(pair_left[j].equals(pair_left[i]) && !pair_right[j].equals(pair_right[i]))
                {
                    count = count + 1;

                }
            }
            System.out.println(count);
            count = 0;
        }


    }
}

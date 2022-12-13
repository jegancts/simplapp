
import java.io.*;
        import java.util.*;

public class ReverseString {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        StringBuilder sb=new StringBuilder(A);
        String B = sb.reverse().toString();
        System.out.format("soruce: %s /n " +  "Destination : %s" , A , B );
        int cmp = A.compareTo(B);

        if(cmp == 0) { System.out.format("the string is  %S palindrome", A ); }
        else { System.out.format("the string is  %S not a plaindrome", A ); }
        /* Enter your code here. Print output to STDOUT. */

    }
}





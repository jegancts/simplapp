import java.io.*;
import java.util.*;

public class stdin {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        int x;
        int y, z, k;
        Scanner in = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        x = in.nextInt();
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < x; i++) {
            k = in.nextInt();
            list.add(k);
        }
        // System.out.println(list);
        // String opration = in.nextLine();
        int l = in.nextInt();
        String opration = sc.next();

        y = in.nextInt();
        z = in.nextInt();
        list.add(y, z);
        // System.out.println(list);
        String opration1 = sc.next();
        int m = in.nextInt();

        list.remove(m);
        System.out.println(Arrays.toString(list.toArray()).replaceAll("[\\[\\]]",""));


    }
}
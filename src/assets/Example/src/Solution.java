import java.util.*;
import java.io.*;

class Solution{
    public static void main(String []argh)
    {
        Scanner in = new Scanner(System.in);
        Map<String,Integer> phonemap = new HashMap<String , Integer>();
        ArrayList<String> sc = new ArrayList<>();
        int n=in.nextInt();

        for(int i=0;i<n;i++)
        {
            in.nextLine();
            String name=in.nextLine();
            int phone=in.nextInt();
            phonemap.put(name,phone);
        }
        in.nextLine();
        String m=in.nextLine();
        String p=in.nextLine();
        String o=in.nextLine();

       if (phonemap.containsKey(m))
           System.out.println(m + '=' + phonemap.get(m));
       else System.out.println("Not found");
        if (phonemap.containsKey(p))
        System.out.println(p + '=' + phonemap.get(p));
        else System.out.println("Not found");
        if (phonemap.containsKey(o))
        System.out.println(o + '=' + phonemap.get(o));
        else System.out.println("Not found");

//        while(in.hasNext())
//        {
//            String s=in.nextLine();
//            sc.add(s);
//        }
//        for(int j=0;j<sc.size();j++) {
//            String search= sc.get(j);
//            phonemap.get(search);
//        }

    }
}

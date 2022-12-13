

import java.util.HashMap;
        import java.util.Iterator;
        import java.util.Map;
        import java.util.Scanner;



        import java.util.*;

public class StringHanling {

    static boolean isAnagram(String str1, String str2) {


//        String s = str1.replace("a", "0");
//        char[] c = s.toCharArray();
//        for ( char k: c
//             ) {
//            System.out.println(k);
//        }
//

        int [] int1 = { 20,21,22,23};
        int[] int2 = {21,20,24,22};


        Arrays.sort(int1);
        Arrays.sort(int2);
        Boolean b1 = Arrays.equals(int1,int2);
        for (int key: int2
             ) {
           // System.out.println(key);
        }
      //  System.out.println(key);
        int startInt = int2[0];
        int nextInt;
        boolean flag = true;
        for(int i =0 ; i < int2.length-1;i++) {

            nextInt = int2[i] + 1;
         //   System.out.println(nextInt);
            if (nextInt != int2[i+1]) {
                flag = false;
            }
            else{
                System.out.println(nextInt);
            }
        }

        if (flag == true)
            System.out.println("conscuinve");
        else     System.out.println("non conscuinve");



        return true;

    }


    public static void main(String[] args) {

        String str1 = "Jeganan";
        String str2 = "Maharajan";

        boolean ret = isAnagram(str1, str2
        );
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}

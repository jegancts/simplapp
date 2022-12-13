import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class DublicateInList {

    public static void main(String args[]) {


        int myNum = 5;               // Integer (whole number)
        float myFloatNum = 5.99f;    // Floating point number
        char myLetter = 'D';         // Character
        boolean myBool = true;       // Boolean
        String myText = "Hello";





        List<Integer> in1 = new LinkedList<>();
        in1.add(10);
        in1.add(20);
        in1.add(30);
        in1.add(40);
        in1.add(40);

        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();

        for (int element : in1
             ) {
            if(!set1.add(element)) {
                set2.add(element);
            }

        }
        System.out.println(set1);
        System.out.println(set2);


       // 2. Stream implementation to get dublicate
        Set<Integer> set3 = new HashSet<>();
        Set<Integer> set4 = new HashSet<>();
        List<Integer> int1 = in1.stream().filter(x -> set3.add(x) ).collect(Collectors.toList());
        List<Integer> int2 = in1.stream().filter(x -> !set4.add(x) ).collect(Collectors.toList());
        System.out.println(int1);
        System.out.println(int2);
    }






}

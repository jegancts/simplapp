import java.util.ArrayList;
import java.util.List;

public class ArrayMoveElemetsLast {

    public static void main(String[] args) {
        int toMove = 3;
        int[] array = new int[]{1, 3, 4, 5, 2, 3, 3};
        List<Integer> retList = moveElementToEnd(array, toMove);
        System.out.println(retList);
    }

    public static List<Integer> moveElementToEnd(int[] array, int toMove) {
        // Write your code here.
        int newArr[] = new int[array.length];
        int lastIndertedNotToMoveIdx = 0;
        int endOfArrayIdx = array.length-1;
        // ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == toMove) {
                newArr[endOfArrayIdx] = array[i];
                endOfArrayIdx = endOfArrayIdx-1;
            } else {
                newArr[lastIndertedNotToMoveIdx] = array[i];
                lastIndertedNotToMoveIdx++;
            }
        }

        for (int arr1: newArr

             ) {
            System.out.println(arr1);
        }
        List<Integer> ret_list = new ArrayList<Integer>();
        for(Integer num:newArr) {
            ret_list.add(num);
        }
        return ret_list;
    }
}

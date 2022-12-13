import java.sql.Array;
import java.util.Random;

public class MinArray {

    public static void main(String args[] )  {

      CallArray callArray = new CallArray();
     //   int[] arrayq = new Random().ints(4, 100, 200).toArray();
      int[] Array2 = callArray.solution(4);
        for (int element:Array2
             ) {
            System.out.println( element);
        }
        }

    }

 class CallArray {
     public int[] solution(int N) {
    //     int[] Array1 = new int[N];
    //     Random rand = new Random();
    //     for (int i = 0; i < N; i++) {
    //         int minArray = rand.nextInt();
    //         Array1[i] = minArray;
     //    }
         return (new Random().ints(4, 100, 200).toArray());
     }
 }
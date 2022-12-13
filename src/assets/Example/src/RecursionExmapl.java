public class RecursionExmapl {

    private static int count;
    private static int[] arr1 = new int[10] ;
    private static int index = 0;

    public static void main(String[] args) {
        int[] arr = {4, 2, 3, 5, 3, 6, 7, 3, 3, 2};

        int[] arr1 = TravelWithinArray(arr, 0, 0, 3);

    }

    private static int[] TravelWithinArray(int[] arr, int start, int move, int element) {
      if(start < arr.length)
        if (arr[start] != element) {
            arr1[index] = arr[start];
            index= index + 1;
            System.out.println(arr[start]);
            start = start + 1;
            TravelWithinArray(arr,start++,move,element);

        } else {
            move = move + 1;
            start =start + 1;
            System.out.println(arr[start]);
            TravelWithinArray(arr,start++,move,element);
        }

        for(int i = arr.length -1  ;  move!=0 ;i--) {
            arr1[i] = 3 ;
            move=move-1;
            count= count+1;
        }

        for(int j = 0;j < arr.length;j++)
            System.out.println(arr[j]);
        return arr;

    }
}

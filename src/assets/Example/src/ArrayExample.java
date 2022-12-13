public class ArrayExample {

    public static void main(String[] args) {
        int[]  arr = new int[4];
        arr[0] = 10;
        arr[1] = 5;
        arr[2] = 15;
        arr[3] = 7;
        int[] sortedarray = customsort(arr);

        int low = 0;
        int element = 15;
        int high = sortedarray.length;
        boolean found = searchElement(sortedarray,element,low,high);
        if (found)
        System.out.println("found");
        else
            System.out.println("not found");
    }

    private static boolean searchElement(int[] sortedarray, int element,int low,int high) {

        int mid = (high + low)/2;

        if(high > low) {

            if((sortedarray[mid]) == element){
                System.out.println("index:" + mid);
           return true;
            }
            else if (sortedarray[mid] > element) {
                high = mid -1;
                searchElement(sortedarray,element,low,high);
            }
            else {
                low = mid+1;
                searchElement(sortedarray,element,low,high);
            }

        }

        return false;
    }

    private static int[] customsort(int[] arr) {
        int temp;
        for(int i=0;i<arr.length;i++)
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j] < arr[i]) {
                    temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;

                }
            }
        }

        for (int ele: arr
             ) {
            System.out.println(ele);

        }
        return arr;
    }
}

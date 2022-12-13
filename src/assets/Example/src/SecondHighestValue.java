public class SecondHighestValue {
    public static void main(String[] args) {

        int[] array = {10, 5, 20, 7, 30};
        int value = findSecondHighest(array);
        System.out.println(value);
    }


    private static int findSecondHighest(int[] array) {
        int highest = array[0];
        int secondHighest = array[0];

        for (int i : array) {
            if (i > highest) {
                secondHighest = highest;
                highest = i;
            } else if (i > secondHighest) {
                secondHighest = i;
            }

        }
        return secondHighest;
    }
}
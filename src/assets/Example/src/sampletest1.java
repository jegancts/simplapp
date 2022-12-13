import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.ConcurrentHashMap;

class sampletest1 {

    public static void main(String[] args) {
        // Creating ConcurrentMap using ConcurrentHashMap
        ConcurrentMap<String, Integer> numbers = new ConcurrentHashMap<>();

        // Insert elements to map
        numbers.put("Two", 2);
        numbers.put("One", 1);
        numbers.put("Three", 3);
        System.out.println("ConcurrentMap: " + numbers);

        // Access the value of specified key
        int value = numbers.get("One");
        System.out.println("Accessed Value: " + value);

//        // Remove the value of specified key
//        int removedValue = numbers.remove("Two");

        int ispresent = numbers.replace("Two",4);
//        System.out.println("Removed Value: " + removedValue);
        int value1 = numbers.get("Two");
        System.out.println("Replaced Value: " + value1);
        System.out.println("Replaced Value: " + numbers);


    }
}
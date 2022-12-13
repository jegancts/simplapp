import java.util.*;

public class ArrayListComp {

    public static void main(String args[]) {

        SortedMap<String, String> sortedMap = new TreeMap();

        sortedMap.put("a","1");
        sortedMap.put("c", "3");
        sortedMap.put("e", "5");
        sortedMap.put("d", "4");
        sortedMap.put("b", "2");

        SortedMap subMap = sortedMap.subMap("b", "e");
        System.out.println(subMap);
        SortedMap headMap = sortedMap.headMap("c");
        System.out.println(headMap);
        SortedMap tailMap = sortedMap.tailMap("c");
        System.out.println(tailMap);

        NavigableMap original = new TreeMap();
        original.put("1", "1");
        original.put("2", "2");
        original.put("3", "3");
        original.put("4", "4");
        original.put("5", "5");

//this submap1 will contain "3", "3"
        SortedMap    submap1  = original.subMap("2", "4");

        Object ceilingKey = original.ceilingKey("2");
        Object floorKey = original.floorKey("2");
        Object lowerKey = original.lowerKey("2");
        Map.Entry first = original.pollFirstEntry();
        Map.Entry last = original.pollLastEntry();

        System.out.print(ceilingKey + " " + floorKey + " " + lowerKey + " " + first + " " + last);





    }
}

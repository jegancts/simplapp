
import java.util.HashMap;
        import java.util.Map;

// Program to increment a key's value of a map in Java
class MapIncrementIfFoundKey
{
    public static<K> void incrementValue(Map<K, Integer> map, K key)
    {
        // containsKey() checks if this map contains a mapping for a key
        Integer count = map.containsKey(key) ? map.get(key) : 0;
        map.put(key, count + 1);
    }

    public static void main(String[] args)
    {
        Map<String, Integer> map = new HashMap();
        map.put("A", 100);

        incrementValue(map, "A");
        incrementValue(map, "B");

        System.out.println(map);
    }
}
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionTreemap {

    public static void main(String[] args) {
        TreeMap<Integer, String> conMap = new TreeMap<>();
        conMap.put(10, "Jegan");
        conMap.put(5, "Mani");
        conMap.put(11, "rani");
        conMap.put(null, "data");

        Iterator<Map.Entry<Integer, String>> itr = conMap.entrySet().iterator();
        while (itr.hasNext()) {

            System.out.println(itr.next());
        }
    }
}

import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class CollectionCuncurrentHashmap {

    String name ;

    CollectionCuncurrentHashmap() {
        this.name = null;
    }



    public static void main(String[] args) {
        ConcurrentHashMap<Integer,String> conMap = new ConcurrentHashMap();
        conMap.put(10, "Jegan");
        conMap.put(5, "Mani");
        conMap.put(11, "rani");

        Iterator<Map.Entry<Integer,String>> itr = conMap.entrySet().iterator();
        while(itr.hasNext()) {
            conMap.put(12, "New");
            System.out.println(itr.next());
        }

    }

}




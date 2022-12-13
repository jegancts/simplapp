import lombok.Synchronized;

import java.util.*;

public class CollectionsSynMap {

    public static void main(String[] args) {

        long startdate = System.currentTimeMillis();
        long startdate1 = System.nanoTime();

        Map<Integer, String> map = new HashMap<>();
        map.put(10, "Jegan");
        map.put(15, "Mani");
        map.put(11, "rani");
        map.put(20, "Jegan");
        map.put(25, "Mani");
        map.put(31, "rani");
        map.put(40, "Jegan");
        map.put(55, "Mani");
        map.put(61, "rani");
        map.put(10, "Jegan");
        map.put(65, "Mani");
        map.put(71, "rani");


        Map<Integer, String> synchronizedMap = Collections.synchronizedMap(map);
        Iterator<Map.Entry<Integer, String>> iterator = synchronizedMap.entrySet().iterator();

         synchronized (synchronizedMap) {
             while (iterator.hasNext()) {
                 //        synchronizedMap.put(3, "Modification");
                 System.out.println(iterator.next());
             }
         }


        long enddate = System.currentTimeMillis();
        long enddate1 = System.nanoTime();

        System.out.println(enddate1 - startdate1);

        System.out.println(System.nanoTime());


//        Map <Integer,String> map1 =  Collections.synchronizedMap(map);
//        Set<Integer> keys = map1.keySet();
//
//        Iterator itr = keys.iterator();
//
////       map1.put(40, "anil");
//        while (itr.hasNext()) {
//            map1.put(40, "anil");
//            Integer key = (Integer) itr.next();
//            System.out.println(key);
//        }
//
//        System.out.println(map1);


//            Set<Map.Entry<Integer,String>> ent =  map.entrySet();
//
//        for (Map.Entry<Integer,String> entry: ent) {
//
//            System.out.println(entry.getKey() + "/" + entry.getValue());
//
//        }

    }

}


//    Set<Integer> keys = map.keySet();
//
//    Iterator itr = keys.iterator();
//        while(itr.hasNext()) {
//
//                Integer key = (Integer) itr.next();
//                System.out.println(key);
//                }
import java.util.HashMap;
import java.util.Map;

public class immutableWithHashTable {

    public static void main(String[] args) {
        Map<String,String> tempMap = new HashMap<>();
        tempMap.put("CSE", "New");
        tempMap.put("EEE","old");
        Department department = new Department("Jegan" , 23 , tempMap);

        Double testAge = department.getAge();
        String testName = department.getName();
        Map<String,String> testMap = department.getMapdata();

        System.out.println(testAge.hashCode());
        System.out.println(testName.hashCode());
        System.out.println(testMap.hashCode());


        System.out.println(testAge);
        System.out.println(testName);
        System.out.println(testMap);

        tempMap.put("EE1","old1");
        Map<String,String> testMap1 = department.getMapdata();
        System.out.println(testMap1);
        System.out.println(testMap1.hashCode());
    }
}


final class Department{

    private final String name;
    private final double age;
    private final Map<String,String> mapdata;


    Department(String name, double age, Map<String, String> mapdata) {
        this.name = name;
        this.age = age;

        Map<String,String> tempMap = new HashMap<>();
        for (Map.Entry<String,String> entry : mapdata.entrySet()
        ) {

            tempMap.put(entry.getKey(), entry.getValue());
        }

        this.mapdata = tempMap;
    }
    public String getName() {
        return name;
    }

    public double getAge() {
        return age;
    }

    public Map<String, String> getMapdata() {

        Map<String,String> tempMap = new HashMap<>();
        for (Map.Entry<String,String> entry : mapdata.entrySet()
        ) {

            tempMap.put(entry.getKey(), entry.getValue());
        }

        return mapdata;
    }




}
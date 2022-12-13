

import java.sql.Struct;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Student {

    public String name;
    public int id;
    public Student(String name, int id) {
        this.name = name;
        this.id = id;
    }

    @Override
    public boolean equals(Object obj) {
        Student s = (Student) obj;
        return s.name.equals(this.name) && s.id == this.id;
    }

    @Override
    public int hashCode() {
        return this.id;
    }
}


public class HashMapImpl {

    public static void main(String args[]) {

        HashMap<Student,Integer> hm = new HashMap<>();
        hm.put(new Student("Jegan",10), 100);
        hm.put(new Student("Jegan1",11), 101);
        hm.put(new Student("Jegan2",12), 102);
        hm.put(new Student("Jegan3",13), 103);
        hm.put(new Student("Jegan4",15), 104);


        for( Map.Entry<Student, Integer> name : hm.entrySet()) {
            System.out.println(name.getKey().name);
            System.out.println(name.getKey().id);
            System.out.println(name.getValue());
        }

        HashMap<String,Integer> hm1 = new HashMap<>();
        hm1.put("Jegan",100);
        hm1.put("Jegan",101);

       List<Integer> st1 =  hm.entrySet().stream().map((x) -> x.getValue()).collect(Collectors.toList());
       System.out.println(st1);

//
//        for( Map.Entry<String, Integer> name : hm1.entrySet()) {
//            System.out.println(name.getKey());
//            System.out.println(name.getValue());
//
//        }

    }
}

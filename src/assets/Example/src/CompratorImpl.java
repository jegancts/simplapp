import java.security.PublicKey;
import java.util.*;
import java.util.stream.Collectors;

public class CompratorImpl {

    public static void main(String args[]) {

        List<Student1> list1 = new ArrayList<>();
        list1.add(new Student1("Cegan" , 20 , "cse"));
        list1.add(new Student1("Banana" , 21 , "cse1"));
        list1.add(new Student1("Apple" , 27 , "cse2"));
        list1.add(new Student1("Apple" , 23 , "cse3"));

        list1.sort(Comparator.comparing(Student1::getName).thenComparing(Student1::getAge));

        List<Student1> list2 =  list1.stream().sorted( (o1, o2) -> o1.getName().compareTo(o2.getName())).collect(Collectors.toList());


        System.out.println(list1);

        Set<Integer> set1 = new HashSet<>();
        set1.add(20);
        set1.add(10);
        set1.add(30);
        set1.add(15);

        List<Integer> list3 = new ArrayList<>();
        set1.add(20);
        set1.add(10);
        set1.add(30);
        set1.add(15);

        Collections.sort(list3);

        Set<Integer> set2 = new HashSet<>();
        set2 = set1.stream().sorted((o1, o2) -> o1 - o2).collect(Collectors.toCollection(LinkedHashSet::new));
        System.out.println(set2);

    }

}


class Student1 {

    private String name;
    private int Age;
    private String dept;

    public Student1(String name, int age, String dept) {
        this.name = name;
        Age = age;
        this.dept = dept;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return Age;
    }

    public void setAge(int age) {
        Age = age;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }



    @Override
    public String toString() {
        return getName() + "/" + getAge() + "/" + getDept();
    }



}

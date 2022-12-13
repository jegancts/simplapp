import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ComparaableExp {

    public static void main(String args[]) {
        List<Student3> lists = new ArrayList<>();
        lists.add(new Student3("Began",21,"cse"));
        lists.add(new Student3("Aegan1",22,"cse5"));
        lists.add(new Student3("Degan1",30,"cse2"));
        lists.add(new Student3("Cegan3",28,"cse7"));
        lists.add(new Student3("Aegan1",21,"cse3"));
        lists.sort((o1,  o2) -> o1.getName().compareTo(o2.getName()));

//        Collections.sort(lists, new Comparator<Student3>() {
//            @Override
//            public int compare(Student3 o1, Student3 o2) {
//                if(o1.getName() == o2.getName())
//                    return o1.getAge()- o2.getAge();
//
//                return o1.getName().compareTo(o2.getName());
//            }
//        } );
        System.out.println(lists);

        System.out.println(lists.stream().map(x-> x.getAge()).collect(Collectors.summingInt(Integer::intValue)));
        System.out.println(lists.stream().peek(x->System.out.println(x)).map(x-> x.getName()).collect(Collectors.joining()));
        System.out.println(lists.stream().collect(Collectors.groupingBy(Student3::getAge,Collectors.mapping(Student3::getName,Collectors.toList()))));
        System.out.println(lists.stream().collect(Collectors.groupingBy(Student3::getAge,Collectors.counting())));
    }
}


class Student3  {
    private String name;
    private int Age;
    private String dept;

    public Student3(String name, int age, String dept) {
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


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ComprableExample {

    public static void main(String args[]) {
        List<Student2> lists = new ArrayList<>();
        lists.add(new Student2("Began",21,"cse"));
        lists.add(new Student2("Aegan1",22,"cse5"));
        lists.add(new Student2("Degan1",30,"cse2"));
        lists.add(new Student2("Cegan3",28,"cse7"));
        lists.add(new Student2("Aegan1",21,"cse3"));
        Collections.sort(lists);
        System.out.println(lists);
    }
}


class Student2 implements Comparable<Student2> {
    private String name;
    private int Age;
    private String dept;

    public Student2(String name, int age, String dept) {
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

    @Override
    public int compareTo(Student2 o) {
        if(this.getName() == o.getName())
            return this.getAge() - o.getAge();
        return this.getName().compareTo(o.getName());
    }
}

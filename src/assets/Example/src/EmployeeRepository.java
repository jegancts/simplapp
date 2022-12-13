import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeRepository {

    public static List<Employee> findByAge(int age) {

        Employee[] arrayOfEmps = {
                new Employee("Jegan",  100000.0,23),
                new Employee("Mani",  200000.0,45),
                new Employee("Abitha",  300000.0,21)
        };
        List<Employee> emp1 = Arrays.asList(arrayOfEmps);
        return  emp1.stream().filter(e-> e.getAge().equals(age)).collect(Collectors.toList());

    }


    public static Integer findCal(Integer integer) {

        if (integer == 0)
        return integer * 2;
        else return  integer * 10;
    }
}

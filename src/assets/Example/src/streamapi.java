import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class streamapi {

    public static void main(String args[]) {

        //   streamapi s1 = new streamapi();
        //  s1.stringoperations();
        //  s1.foreach();
        //  s1.reduce();
        //  s1.comparemin();





//        List<Employee> emp1 = new LinkedList<>();
//        emp1.add(new Employee("Jegan", 20000.00, 23));
//        emp1.add(new Employee("Anil", 50000.00, 21));
//        emp1.add(new Employee("Braba", 15000.00, 25));
//        emp1.add(new Employee("Charley", 40000.00, 21));
//        emp1.add(new Employee("David", 30000.00, 30));
//        emp1.add(new Employee("David", 30000.00, 30));
//        int i = 0;
//
//        emp1.stream().map(e-> e.getName()).distinct().collect(Collectors.toList()).forEach(System.out::println);
      //  emp1.add(new Employee("David", 30000.00, 31));

      //  List<String> set1 = emp1.stream().map(emp-> emp.getName()).distinct().collect(Collectors.toList());
      //  System.out.println("set :" + set1 );
//       Collections.sort(emp1,new SortByName());
//
//       for(int i = 0 ; i < emp1.size();i++) {
//           System.out.println(emp1.get(i));
//       }

//       List<Employee> emp2 = emp1.stream().sorted().collect(Collectors.toList());
//
//     System.out.println("stopped"+ emp2);
//        System.out.println("set :" + set1 );

//        Map<Object,List<Employee>> map1 = new HashMap<>();
//         Map<String, Integer > map9 = emp1.stream().collect(Collectors.toMap(Employee::getName, Employee::getAge));
//         List<Map.Entry<String,Integer>> lo = map9.entrySet().stream().collect(Collectors.toList());
//         System.out.println(lo + "prinds");
      //    map1 = map9.stream().collect(Collectors.groupingBy(employee -> employee.getAge()));
      //    System.out.println(map1);
        // emp1.stream().map(e-> e.getAge(),Collectors.counting(Function.identity(),Collectors.toMap(map1)));
//
//        .collect(Collectors.toMap(Animal::getId, Function.identity()))

//        HashMap<String, Integer> map7 = new HashMap<>();
////
//        Map<String, Integer > map2 = emp1.stream().collect(Collectors.toMap(Employee::getName, Employee::getAge));
////
//        System.out.println(map2);

//
//        Iterator<String> it1 = map1.keyset().iterator();
//        while (it1.hasNext()) {
//            String lkey = it1.next();
//            System.out.println("key: " + lkey);
//
//        }

        HashMap<Integer, String> map = new HashMap<>();

        map.put(1, "A");
        map.put(2, "B");
        map.put(3, "C");
        map.put(4, "D");

        System.out.println(map);

//Get iterator
        Iterator<Integer> iterator = map.keySet().iterator();

//Iterate over all values
        while(iterator.hasNext())
        {
           Integer int1 = iterator.next();
            System.out.println( "Value : " + map.get(int1) );
        }


    }

//        for (String s1:set1
//             ) {
//            System.out.println(s1);
//        }




    private void comparemin() {

        List<Integer> list1 = Arrays.asList(10,5,20,15,30,25);

        Comparator<Integer> minvalue = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Comparator<Integer> maxvalue = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };

        Optional<Integer> mins = list1.stream().min(minvalue);
        System.out.println(mins);

        Optional<Integer> maxs = list1.stream().max(minvalue);
        System.out.println(maxs);

    }

    private void reduce() {

        List<String> list = new ArrayList<>();

        list.add("Jegan");
        list.add("Anil");
        list.add("Mani");
        list.add("Pinky");

      list.stream().reduce((s1,s2) -> (s1 + " " + s2)).stream().collect(Collectors.toList()).forEach(System.out::println);

        List<Integer> sum = new ArrayList<>();

        sum.add(10);
        sum.add(20);
        sum.add(30);
        sum.add(40);

      sum.stream().reduce((s1,s2) -> (s1+s2)).stream().collect(Collectors.toList()).forEach(System.out::println);


    }

    private void foreach() {

        List<String> list = new ArrayList<>();

        list.add("Jegan");
        list.add("Anil");
        list.add("Mani");
        list.add("Pinky");

     Long count1 =     list.stream().map(String::toUpperCase).filter((s) -> s.contains("I")).count();
     System.out.println(count1);


    }

    private void stringoperations() {

        List<String> list = new ArrayList<>();
        list.add("Jegan");
        list.add("Anil");
        list.add("Mani");
        list.add("Pinky");

        Stream<String> stream =  list.stream().map(String::toUpperCase).filter((s) -> s.equalsIgnoreCase("jegan"));
        //stream.forEach( p -> System.out.println(p));
        String[] listofStrings = stream.toArray(String[]::new);
        for(int j =0 ; j < listofStrings.length ; j++) {
            System.out.println( listofStrings[j]);

        }

        // stream.limit(10).forEach(System.out::println);
    }

    private void printcall1() {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);

        Stream<Integer> stream =  list.stream().filter(s -> s > 1 ).map( s -> s * s).sorted();
        //stream.forEach( p -> System.out.println(p));
        List<Integer> listofintegers = stream.collect(Collectors.toList());
        System.out.println(listofintegers);
       // stream.limit(10).forEach(System.out::println);
    }

    private void toarray() {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);

        Stream<Integer> stream =  list.stream().filter(s -> s > 1 ).map( s -> s * s).sorted();
        //stream.forEach( p -> System.out.println(p));
        Integer[] listofintegers = stream.toArray(Integer[]::new);
        for(int j =0 ; j < listofintegers.length ; j++) {
            System.out.println( listofintegers[j]);

        }
        System.out.println(listofintegers);
        // stream.limit(10).forEach(System.out::println);
    }

    private void printcall() {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(5);
        list.add(15);

        Stream<Integer> stream =  list.stream().filter(s -> s > 1 ).map( s -> s * s).sorted();
        //stream.forEach( p -> System.out.println(p));
        stream.limit(10).forEach(System.out::println);
    }


}

import javax.swing.text.ElementIterator;
import java.security.PublicKey;
import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static java.util.stream.Collectors.*;

public class StreamApiNew {

    public static void main(String args[]) {

//        List<String> strings = List.of("a", "bb", "cc", "ddd");
//        Map<Integer, List<String>> result = strings.stream()
//                .collect(groupingBy(String::length));
//
//        System.out.println(result); // {1=[a], 2=[bb, cc], 3=[ddd]}
//********************************************concat based on lenght of string ********

//        List<String> list = List.of("jegan","one", "two", "three" ,"abc" , "abcde");
//        Map<Integer, String> result1 = list.stream()
//                .collect(toMap(String::length, e -> e, String::concat));
//        System.out.println(result1); //{3=onetwoabc, 5=jeganthreeabcde}

//********************************************Array to List ********

//        Employee[] arrayOfEmps = {
//                new Employee("Jegan",  100000.0,23),
//                new Employee("Mani",  200000.0,45),
//                new Employee("Abitha",  300000.0,21)
//        };
//
//        List<Employee> emp1 = Arrays.asList(arrayOfEmps);
//        OptionalInt stream1 = emp1.stream().mapToInt(Employee::getAge).max();
//              //  collect(Collectors.toSet());
//        System.out.print("stream:" + stream1);
    //********************************************Exception ***********

                Employee[] arrayOfEmps = {
                new Employee("Jegan",  100000.0,23),
                new Employee("Mani",  200000.0,45),
                new Employee("Abitha",  300000.0,21)
        };

        List<Employee> emp1 = Arrays.asList(arrayOfEmps);
        int stream1 = emp1.stream().mapToInt(Employee::getAge).max().orElseThrow(NoSuchElementException::new);
              //  collect(Collectors.toSet());
        System.out.print("stream:" + stream1);

               Optional<Double> mins = emp1.stream().map(e-> e.getSalary()).min((o1, o2 ) -> o1.compareTo(o2));
               System.out.println("mins: " + mins);

        //********************************************Usgin external method calling passing parameter ***********

//        Integer[] empIds = { 23,45};
//       List<List<Employee>> stream = Stream.of(empIds)
//                .map(EmployeeRepository::findByAge).collect(Collectors.toList());
//        System.out.println("emp :" + stream);

        //********************************************Usgin external method calling passing parameter ***********
//
//        String ISBN = "3234567891";
//        char[] chars = new char[ISBN.length()];
//        List<Integer> list = new ArrayList<>();
//        for(int i = 0; i < ISBN.length();i++) {
//            chars[i] = ISBN.charAt(i);
//             int   list1 = Integer.parseInt(String.valueOf(chars[i]));
//             list.add(list1);
//            System.out.println(list1);
//        }
//
//        List<Integer> calList = list.stream().map(EmployeeRepository::findCal).collect(Collectors.toList());
//        System.out.println("int:" + calList);
        //********************************************ISBN***********
//
//        String ISBN = "3234567891";
//        char[] chars = new char[ISBN.length()];
//        int sum = 0;
//        for(int i = 9, j = 1; i >= 0 && j <= 10 ; j++,i--) { chars[i] = ISBN.charAt(i);sum += Integer.parseInt(String.valueOf(chars[i])) * j; }
//        System.out.println(sum);
        //********************************************integer Array***********
//        int [] numbers = {1,2,3,4,5,6,7,8};
//        int [] doubleNumbers = new int[numbers.length];
//        int [] tripleNumbers = new int[numbers.length];
//       for(int index = 0; index < numbers.length; index++)
//        {
//            doubleNumbers[index] = numbers[index] * 2;
//            tripleNumbers[index] = numbers[index] * 3;
//        }
//        System.out.println("Double Numbers");
//        Arrays.stream(doubleNumbers).forEach(System.out::println);
//        System.out.println("Triple Numbers");
//        Arrays.stream(tripleNumbers).forEach(System.out::println);
        //********************************************integer Array***********
        /* replacement of above array */
                int [] numbers = {9,2,3,2,5,6,0,9};


        int [] doubleNumbers = new int[numbers.length];
        int [] tripleNumbers = new int[numbers.length];

        IntStream.range(0, numbers.length)
                .forEach(index -> {
                    doubleNumbers[index] = numbers[index] * index;
                  //  tripleNumbers[index] = numbers[index] * 3;
                    System.out.println(doubleNumbers[index]);
                });
        List<Integer> number1 =  Arrays.stream(doubleNumbers).boxed().collect(Collectors.toList());
        System.out.println("doubleNumbers:" + number1 );

        Map<Integer,Integer> mpa = new HashMap<Integer, Integer>();

           List<Integer> listA = Arrays.asList(2,3,4,5);

           IntStream.range(0,listA.size()).forEach(index -> {
                     int A  = listA.get(index) * index;
                     mpa.put(A,index);

                   });
                   System.out.println("maps : " + mpa);



        //********************************************integer Array***********
        /*/* replacement of above array */
//
//        int[] numbers1 = {1, 2, 3, 4, 5, 6, 7, 8};
//        System.out.println("Double Numbers");
//        Arrays.stream(numbers1).map(x -> x * 2).forEach(System.out::println);
//        System.out.println("Triple Numbers");
//        Arrays.stream(numbers1).map(x -> x * 3).forEach(System.out::println);
        //********************************************integer Array***********
        /*/* replacement of above array using map */
 //       int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8};
//        Map<Integer, Integer> m = Arrays.stream(numbers)
//                .boxed()
//                .collect(Collectors.toMap(
//                        x -> x * 2,
//                        x -> x * 3
//                ));
//
//        System.out.println(m);



        //*******************************************charetor array***********
        String s = "qwertyuiopasdfg";

        Map<Integer,Character> charToInt = s.chars()
                .mapToObj(i -> (char) i)
                .collect(Collectors.toMap( c -> s.indexOf(c),c -> c));
        System.out.println("charToInt:" + charToInt ) ;

        //********************************************integer Array***********

//        List<Integer> intList = Arrays.asList(2, 4, 5, 8);
//        boolean allEven = intList.stream().allMatch(i -> i % 2 == 0);
//        boolean oneEven = intList.stream().anyMatch(i -> i % 2 == 0);
//        boolean noneMultipleOfThree = intList.stream().noneMatch(i -> i % 3 == 0);
//        System.out.println(allEven + " " + oneEven + " " +  noneMultipleOfThree);
        //********************************************sum using reduce***********
//        List<Double> empList = List.of(20.00,10.00,30.00);
//        Double sumSal = empList.stream()
//                .map(e-> e)
//                .reduce(0.0, Double::sum);
//        System.out.println(sumSal);
//
//        List<Integer> empList1 = List.of(20,10,30);
//        Integer sumSal1 = empList1.stream()
//                .map(e-> e)
//                .reduce(0, Integer::sum);
//        System.out.println(sumSal);

        //********************************************min max using comparator***********
//        List<Integer> empList1 = List.of(20,10,30);
//        Optional<Integer> minval = empList1.stream().min(Comparator.comparing(e-> e));
//        Optional<Integer> maxval = empList1.stream().max(Comparator.comparing(e-> e));
//        System.out.println(minval + " " + maxval);

        //********************************************Joining***********

//        Employee[] empList = {
//                new Employee("Jegan",  100000.0,23),
//                new Employee("Mani",  200000.0,45),
//                new Employee("Abitha",  300000.0,21)
//        };
//        String empNames = Arrays.stream(empList)
//                .map(Employee::getName)
//                .collect(Collectors.joining(", "))
//                .toString();
//        System.out.println(empNames);

        //********************************************stats***********

//        Employee[] empList = {
//                new Employee("Jegan",  100000.0,23),
//                new Employee("Mani",  200000.0,45),
//                new Employee("Abitha",  300000.0,21)
//        };
//       DoubleSummaryStatistics stats= Arrays.stream(empList).collect(Collectors.summarizingDouble(Employee::getSalary));
//       System.out.println("min : " + stats.getMin() );
//        System.out.println("max: " + stats.getMax() );
//        System.out.println("average : " + stats.getAverage() );
//        System.out.println("sum : " + stats.getSum() );
//        System.out.println("count : " + stats.getCount() );
//
//        IntSummaryStatistics stats1 = Arrays.stream(empList).collect(Collectors.summarizingInt(Employee::getAge));
//        System.out.println("min : " + stats1.getMin() );
//        System.out.println("max: " + stats1.getMax() );
//        System.out.println("average : " + stats1.getAverage() );
//        System.out.println("sum : " + stats1.getSum() );
//        System.out.println("count : " + stats1.getCount() );

        //********************************************reducing**********

//        Employee[] empList = {
//                new Employee("Jegan",  100000.0,23),
//                new Employee("Mani",  200000.0,45),
//                new Employee("Abitha",  300000.0,21)
//        };
//
//        Double percentage = 10.0;
//        Double salIncrOverhead = Arrays.stream(empList).collect(Collectors.reducing(
//                0.0, e -> e.getSalary() * percentage / 100, (s1, s2) -> s1 + s2));
//        System.out.println(salIncrOverhead);

        //********************************************reducing**********
//
//        List<Integer> intList = Arrays.asList(2, 4, 5, 6, 8);
//        Map<Boolean, List<Integer>> isEven = intList.stream().collect(
//                Collectors.partitioningBy(i -> i % 2 == 0));
//        if(isEven.containsKey(true)) {
//            List<Integer> list1 = isEven.get(true);
//            System.out.println(list1);
//        }

        //********************************************duplicate**********

//       String str1 = "Jegan is a good boy Jegan is Jegan is";
//       List<String> str2 = Arrays.asList(str1.split(" "));
//       System.out.println(str2);
//       Set<String> str3 =  str2.stream().collect(Collectors.toSet());
//       System.out.println(str3);
//       Set<String> set3 = new HashSet<>();
//       Set<String> set4= str2.stream().filter(e-> !set3.add(e)).collect(Collectors.toSet());
//       System.out.println(set4);
//       List<String> set5= str2.stream().filter(e-> !set3.add(e)).collect(Collectors.toList());
//        System.out.println(set5);

        //Approach 2:
//        String strvalue= "Jegan is a good boy Jegan is Jegan is";
//        Set<String> set3 = new HashSet<>();
//        Set<String> set4 =   Arrays.asList(strvalue.split(" ")).stream().filter(e-> !set3.add(e)).collect(Collectors.toSet());
//        System.out.println("set 1 : " +  set3 + "set 2 : " + set4);


        //********************************************check password **********

//        String str = "test 5 a0A pass007 ?1xy1   £@12AB jeganmajaja!";
//
//        List<String> list = Arrays.asList(str.split(" "));
//
//        Set<String> set1 = new HashSet<>();
//        Pattern pattern = Pattern.compile("[^a-z 0-9]",Pattern.CASE_INSENSITIVE);
//        for (String item: list) {
//            Matcher matcher = pattern.matcher(item);
//            if(!matcher.find()) { set1.add(item);}}
//        System.out.println(set1);
//        String pass = set1.stream().filter(e-> e.length() % 2 != 0)
//                .collect(Collectors.toMap(Function.identity(),String::length))
//                .entrySet().stream().max((entry1,entry2)-> entry1.getValue() - entry2.getValue() ).get().getKey();
//        System.out.println(pass);

     // Appraoch 2  *********
//        String str = "test 5 a0A pass007 ?1xy1   £@12ABv34 jeganmajaja!";
//        String pass =   Arrays.asList(str.split(" ")).stream().filter(e-> e.length() % 2 != 0)
//               .collect(Collectors.toMap(Function.identity(),String::length))
//               .entrySet().stream().max((entry1,entry2)-> entry1.getValue() - entry2.getValue() ).get().getKey();
//            System.out.println("pass1 : " + pass);


        //********************************************check password **********
//        String str1 = "Jegan is a good boy Jegan is Jegan is";
//        List<String> str2 = Arrays.asList(str1.split(" "));
//        Map<String,Long> map1 = str2.stream().collect(groupingBy(Function.identity(),counting()));
//        Set<String> map = str2.stream().collect(groupingBy(Function.identity(),counting())).entrySet().stream().filter(m-> m.getValue()>1)
//              .map(Map.Entry::getKey).collect(toSet());
//********************************************convert map value to string**********
//        Map<Long, String> map = new HashMap<>();
//        map.put(123l , "jegan");
//        map.put(121l , "mani");
//        map.put(125l , "aavi");
//        map.put(126l , "shajahan");
//       //approach 1  ****
//        String sorted =
//                map.entrySet().stream()
//                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                        .map(e-> e.getKey().toString() + "=" + e.getValue().toString())
//                .reduce((a,b) -> a + b ).toString();
//                 //       .collect(Collectors.joining (","));
//        System.out.println("map values sorted:"  +  sorted);
//
//        //approach 2 *******
//        String concatString = map.entrySet()
//                .stream()
//                .map(element-> element.getKey().toString() + " = " + element.getValue().toString())
//                .collect(Collectors.reducing("", (str1,str2) -> str1 + " , " + str2));
//        System.out.println("map values concatString :"  +  concatString );
//
//        //approach 3  ******
//        String sorted1 =
//                map.entrySet().stream()
//                        .sorted(Collections.reverseOrder(Map.Entry.comparingByValue()))
//                        .map(Objects::toString)
//                        .collect(Collectors.joining(","));
//        System.out.println("map values sorted1  :"  +  sorted1 );
        //********************************************check password shajahan way **********
//         String strvar = "Jegan is a good boy Jegan is Jegan is 1234567 !JeganE";
//         String nn = Arrays.asList(strvar.replaceAll("[^a-zA-Z]", " ").split("\\s+"))
//                  .stream().filter(e->e.length()%2!=0)
//                  .max(Comparator.comparing(String::length)).get();
//              System.out.println("password : " + nn);
        //******************************************** regx with stream **********
//        String strvar = "Jegan is a good boy Jegan is Jegan is 1234567abc !JeganE";
//        List<String> nn =  Arrays.asList(strvar.replaceAll("[^a-zA-Z]", " ").split("\\s+"));
//      //          .stream().filter(e->e.length()%2!=0).collect(joining(","));
//        System.out.println(nn);

        //******************************************** Convert custom object list to map**********
        List<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee("Jegan",  100000.0,23));
        emplist.add(new Employee("Mani",  200000.0,24));
        emplist.add(new Employee("Raju",  300000.0,25));

        Map<String, Double> byNameMap = emplist
                .stream()
                .collect(Collectors.toMap(Employee::getName,Employee::getSalary));
        System.out.println(byNameMap);
        //******************************************** Convert custom object list to map**********

                List<Employee> emplist = new ArrayList<>();
        emplist.add(new Employee("Jegan",  10.0,23));
        emplist.add(new Employee("Mani",  20.0,24));
        emplist.add(new Employee("Raju",  30.0,25));
        emplist.add(new Employee("Raju",  30.0,25));

//        var ref = new Object() {
//            int j = 0;
//        };
//
//        Map<Double,Long> lst = emplist.stream().collect(groupingBy(Employee::getAge,summingDouble(Employee::getSalary)))
//                .entrySet().stream().map(k -> k.getKey()*k.getValue()).peek(System.out::println).collect(Collectors.toList());

//          Map<Double,Long>  maps =  lst.stream().collect(groupingBy(Function.identity(),counting()));
//                collect(Collectors.toList())
//                .collect(groupingBy(Function.identity(),counting())

//        Map<String, Double> byNameMap = emplist
//                .stream()
//                .collect(Collectors.toMap(Employee::getName,Employee::getSalary));
//        System.out.println(lst);

        //******************************************** Add custom generated ky in map**********
//        var ref = new Object() {
//            int j = 0;
//        };
//        List<String> list =  Arrays.asList("Vishwa","Ram","Mohan","Sohan");
//        Map<Integer,String> map = list.stream().collect(Collectors.toMap(sa->{return ref.j = ref.j +2;}, Function.identity()));
//        map.forEach((k,v)-> {
//            System.out.print(k+"  ");
//            System.out.println(v);
//        });

        //******************************************** Add custom generated ky in map**********




    }  //main method ends here

} // class ends here
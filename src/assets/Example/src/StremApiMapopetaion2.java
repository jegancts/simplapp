 import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StremApiMapopetaion2 {

    public static void main(String[] args) {

        //3 apple, 2 banana, others 1
        List<Item> items = Arrays.asList(
                new Item("apple", 10, 9.99),
                new Item("banana", 20, 10.99),
                new Item("orang", 10, 29.99),
                new Item("watermelon", 10, 29.99),
                new Item("papaya", 20, 9.99),
                new Item("apple", 10, 9.99),
                new Item("banana", 10, 19.99),
                new Item("apple", 20, 9.99)
        );


        Map<String, Long> result1 =
                items.stream().map(item-> item.getName()).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())
                );
        System.out.println("map details :" + result1);
        //group by price
//       Map<BigDecimal, List<Item>> groupByPriceMap =
//                items.stream().collect(Collectors.groupingBy(Item::getPrice),Collectors.counting());
//        System.out.println(groupByPriceMap);

        Map<String, Long> groupByPriceMap =
                items.stream().collect(Collectors.groupingBy(Item::getName,Collectors.counting()));
        System.out.println(groupByPriceMap);

        // group by price, uses 'mapping' to convert List<Item> to Set<String>
        Map<Integer, Set<String>> result =
                items.stream().collect(
                        Collectors.groupingBy(Item::getQty,
                                Collectors.mapping(Item::getName, Collectors.toSet())
                        )
                );

        System.out.println(result);

    }
}

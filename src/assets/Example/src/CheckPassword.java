import java.util.*;
import java.util.function.Function;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

public class CheckPassword {

    public static void main(String arg[] ) {
        String str = "test 5 a0A pass007 ?1xy1   £@12AB jeganmajaja!";

        List<String> list = Arrays.asList(str.split(" "));

        Set<String> set1 = new HashSet<>();
        Pattern pattern = Pattern.compile("[^a-z 0-9]",Pattern.CASE_INSENSITIVE);
        for (String item: list) {
            Matcher matcher = pattern.matcher(item);
            if(!matcher.find()) { set1.add(item);}}
        System.out.println(set1);
        String pass = set1.stream().filter(e-> e.length() % 2 != 0)
                .collect(Collectors.toMap(Function.identity(),String::length))
                .entrySet().stream().max((entry1,entry2)-> entry1.getValue() - entry2.getValue() ).get().getKey();
        System.out.println(pass);
    }
}

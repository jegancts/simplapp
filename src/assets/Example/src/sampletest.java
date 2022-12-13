import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class sampletest {
    public  static void main ( String arg[]){
        List<String> sampleList = Arrays.asList("Java", "\n \n", "Kotlin", " ");
        List withoutBlanks = sampleList.stream()
                .filter(Predicate.not(String::isBlank))
                .collect(Collectors.toList());
        System.out.println(withoutBlanks);
        System.out.println(sampleList);

        List<String> sampleList1 = Arrays.asList("Java", "Kotlin");
        String resultString = sampleList1.stream()
                .map(x -> x.toUpperCase())
                .collect(Collectors.joining(", "));
        System.out.println(resultString);


    }

}

import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

@FunctionalInterface

interface multiply {
   public  int multiply1(int a, int b , int c);
}

public class FunctionalInterfaceExample {

  public static void main(String args[]) {

     // 1. Funcnal interface
      multiply total = (a,b,c) -> a * b + c;
      int c = total.multiply1(10,20 ,10);
      System.out.println(c);

     //2. Consumer
      Consumer<Integer> con1 = (a) -> System.out.println(a);
      con1.accept(10);

      //3. Supplier
      String name = "Jegan";
      Supplier<String> supplier = () ->  name ;
      String name1 = supplier.get();
      System.out.println(name1);

     //4 . predicate
      Predicate<Integer> predicate = (l) -> l > 4;
      Boolean check1 = predicate.test(6);
      System.out.println(check1);


      }

  }



import java.util.*;

public class AnagramUsingMap {

    static boolean isAnagram(String a, String b) {
        Map<Character, Integer> anagram = new HashMap<>();
        for(int i = 0 ;i < a.length(); i++){
            char readchar = a.charAt(i);
           // int k = 0;
            int count = 0;
            for(int j = 0 ;j < a.length(); j++){
                char readcharAll = a.charAt(j);
                {
                    if(readchar == readcharAll) {
                        count = count + 1 ;
                    }
                }
              }
            anagram.putIfAbsent(readchar,count);
        }
     Iterator<Map.Entry<Character,Integer>> it = anagram.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Character,Integer> entry = it.next();
            System.out.println("key : " + entry.getKey() +  "value : " + entry.getValue());

        }

        Map<Character, Integer> anagram1 = new HashMap<>();
        for(int i = 0 ;i < b.length(); i++){
            char readchar = b.charAt(i);
            // int k = 0;
            int count = 0;
            for(int j = 0 ;j < b.length(); j++){
                char readcharAll = b.charAt(j);
                {
                    if(readchar == readcharAll) {
                        count = count + 1 ;
                    }
                }
            }
            anagram1.putIfAbsent(readchar,count);
        }
        Iterator<Map.Entry<Character,Integer>> it1 = anagram1.entrySet().iterator();
        while(it1.hasNext()){
            Map.Entry<Character,Integer> entry = it1.next();
            System.out.println("key : " + entry.getKey() +  "value : " + entry.getValue());

        }

        if (anagram.equals(anagram1))
            return true;
        else return false;

    }

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
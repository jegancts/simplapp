
import java.util.Scanner;
public class  AnagramsString {

    static boolean isAnagram(String str1, String str2) {
        String s1 = str1.replaceAll("\\s", "").toLowerCase();
        String s2 = str2.replaceAll("\\s", "").toLowerCase();

        boolean status = false;
        if (s1.length() != s2.length()) {
            status = false;
        } else {

            for (int i = 0; i < s1.length() ; i++) {
                for (int j = 0; j < s2.length() ; j++) {
                    if (s1.charAt(i) == s2.charAt(j)) {
                        s2 = s2.substring(0, j) + s2.substring(j + 1);
                        break;
                    }

                }
            }

            if (s2.length() == 0) status = true;
            else  status = false;
        }
        return status;
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
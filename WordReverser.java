import java.util.*;

public class WordReverser {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String s = sc.next();
            String r = new StringBuilder(s).reverse().toString();

            System.out.println(r + (s.equals(r)
                    ? " - palindrome"
                    : " - not a palindrome"));
        }
    }
}

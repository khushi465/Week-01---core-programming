
import java.util.*;

public class P1 {

    public int findLength(String str) {
        int i = 0;
        char ch;
        while (true) {
            try {
                ch = str.charAt(i);
            } catch (Exception e) {
                System.out.println(e);
                return i;
            }
            i++;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();

        P1 obj = new P1();
        int len = obj.findLength(str);
        System.out.println("Using method: " + len);
        int len1 = str.length();
        System.out.println("Using length(): " + len1);

    }
}

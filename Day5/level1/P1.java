
import java.util.*;

public class P1 {

    public boolean isEqual(String s1, String s2) {
        if (s1.length() == s2.length()) {
            for (int i = 0; i < s1.length(); i++) {
                if (s1.charAt(i) != s2.charAt(i)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 2 strings");
        String str1 = sc.next();
        String str2 = sc.next();
        P1 obj = new P1();
        boolean equal = obj.isEqual(str1, str2);
        System.out.println("Equal by method: " + equal);
        System.out.println("Equal by built in method: " + str1.equals(str2));

    }
}

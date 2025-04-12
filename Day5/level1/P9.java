
import java.util.*;

public class P9 {

    public String changeToUpper(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            int ch = (int) str.charAt(i);
            if (ch >= 97 && ch <= 122) {
                str1 += (char) ((int) str.charAt(i) - 32);
            } else {
                str1 += str.charAt(i);
            }
        }

        return str1;
    }

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
        System.out.println("Enter string");
        String str = sc.nextLine();

        P9 obj = new P9();
        // obj.generateException(str);
        String upperCase1 = obj.changeToUpper(str);
        System.out.println("Using method: " + upperCase1);
        String upperCase2 = str.toUpperCase();
        System.out.println("Using built in method: " + upperCase2);
        boolean equal = obj.isEqual(upperCase1, upperCase2);
        System.out.println("Equal " + equal);

    }
}

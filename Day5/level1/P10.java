
import java.util.*;

public class P10 {

    public String changeToLower(String str) {
        String str1 = "";
        for (int i = 0; i < str.length(); i++) {
            int ch = (int) str.charAt(i);
            if (ch >= 65 && ch <= 90) {
                str1 += (char) ((int) str.charAt(i) + 32);
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

        P10 obj = new P10();
        // obj.generateException(str);
        String lowercase1 = obj.changeToLower(str);
        System.out.println("Using method: " + lowercase1);
        String lowercase2 = str.toLowerCase();
        System.out.println("Using built in method: " + lowercase2);
        boolean equal = obj.isEqual(lowercase1, lowercase2);
        System.out.println("Equal " + equal);

    }
}

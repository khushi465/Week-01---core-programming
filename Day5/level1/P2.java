
import java.util.*;

public class P2 {

    public String getSubstring(String s1, int s, int e) {
        String substring = "";
        for (int i = s; i < e; i++) {
            substring += s1.charAt(i);
        }
        return substring;
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
        System.out.println("Enter the string ");
        String str1 = sc.next();
        System.out.println("Enter the start and end index for substring ");
        int start = sc.nextInt();
        int end = sc.nextInt();

        P2 obj = new P2();
        // int start=1, end=3;
        String substring = obj.getSubstring(str1, start, end);
        System.out.println("Substring by getSubstring(): " + substring);
        System.out.println("Substring by built in method: " + str1.substring(start, end));
        boolean equal = obj.isEqual(str1.substring(start, end), substring);
        System.out.println("Equal by method: " + equal);

    }
}

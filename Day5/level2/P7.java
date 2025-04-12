
import java.util.*;

public class P7 {

    public int[] removeSpaces(String str) {
        String str1;
        int start = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ' ') {
                start++;
            } else {
                break;
            }
        }
        int end = str.length() - 1;
        for (int i = str.length() - 1; i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                end--;
            } else {
                break;
            }
        }
        int arr[] = {start, end};
        return arr;
    }

    public String createSubstring(String str) {
        String str1 = "";
        int arr[] = removeSpaces(str);
        for (int i = arr[0]; i <= arr[1]; i++) {
            str1 += str.charAt(i);
        }
        return str1;
    }

    public boolean isEqualsString(String s1, String s2) {
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
        P7 obj = new P7();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String");
        String str = sc.nextLine();
        String trimmed1 = obj.createSubstring(str);
        String trimmed2 = str.trim();
        boolean equal = obj.isEqualsString(trimmed1, trimmed2);
        System.err.println("Using user defined method: " + trimmed1);
        System.err.println("Using built in method: " + trimmed2);
        System.err.println("Is Equal: " + equal);

    }
}

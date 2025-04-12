
import java.util.*;

public class P2 {

    public int findLength(String str) {
        int i = 0;
        char ch;
        while (true) {
            try {
                ch = str.charAt(i);
                i++;
            } catch (Exception e) {
                break;
            }
        }
        return i;
    }

    public char[] findUniqueCharacters(String str) {
        char[] res = new char[findLength(str)];
        int index = 0;
        res[0] = str.charAt(0);
        for (int i = 1; i < findLength(str); i++) {
            int k = 0;
            for (int j = 0; j < i; j++) {
                if (str.charAt(j) == str.charAt(i)) {
                    k = 1;
                    break;
                }
            }
            if (k == 0) {
                res[index] = str.charAt(i);
                index++;
            }
        }
        char[] temp = new char[index];
        for (int i = 0; i < index; i++) {
            temp[i] = res[i];
        }
        res = temp;
        return res;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P2 obj = new P2();
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println("Unique character array");
        char[] res = obj.findUniqueCharacters(str);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}

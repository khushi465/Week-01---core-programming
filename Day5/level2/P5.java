
import java.util.*;

public class P5 {

    public String checkLetter(char i) {
        String res = "";
        if (i >= 65 && i <= 90) {
            i = (char) ((int) i + 32);
            System.out.println(i);
        }
        if (i == 'a' || i == 'e' || i == 'i' || i == 'o' || i == 'u') {
            res = "Vowel";
        } else {
            res = "Consonent";
        }

        if (!(i >= 65 && i <= 90 || i >= 97 && i <= 122)) {
            res = "Not a Letter";
        }
        return res;
    }

    public int[] countNumber(String str) {
        int vowel = 0, consonent = 0;
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            String s = checkLetter(ch);
            if (s.equals("Vowel")) {
                vowel++;
            } else if (s.equals("Consonent")) {
                consonent++;
            }
        }
        int arr[] = {vowel, consonent};
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        P5 obj = new P5();
        int[] arr = obj.countNumber(str);
        System.out.println("Vowel: " + arr[0]);
        System.out.println("Consonent: " + arr[1]);

    }
}

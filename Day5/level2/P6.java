
import java.util.*;

public class P6 {

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

    public String[][] createArray(String str) {
        String arr[][] = new String[str.length()][2];
        for (int i = 0; i < str.length(); i++) {
            String ch = String.valueOf(str.charAt(i));
            arr[i][0] = ch;
            arr[i][1] = checkLetter(str.charAt(i));
        }
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.nextLine();

        P6 obj = new P6();
        String[][] arr = obj.createArray(str);
        System.out.println("Letter\tDescription " + arr[0]);
        for (int i = 0; i < str.length(); i++) {
            System.out.println(arr[i][0] + "\t" + arr[i][1]);
        }
    }
}

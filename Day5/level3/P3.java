
import java.util.*;

public class P3 {

    public int findNonRepeatingCharacter(String str) {
        int freq[] = new int[256];
        int ch = 256;
        for (int i = 0; i < str.length(); i++) {
            freq[(int) str.charAt(i)]++;
        }
        for (int i = 0; i < 256; i++) {
            if (freq[i] == 1) {
                ch = i;
                break;
            }
        }
        return ch;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        P3 obj = new P3();
        System.out.println("Enter string");
        String str = sc.nextLine();
        System.out.println("First non repeater character");
        int ch = obj.findNonRepeatingCharacter(str);
        if (ch == 256) {
            System.out.println("No non repeating character");
        } else {
            System.out.println((char) ch);

        }
    }
}


import java.util.*;

public class P5 {

    public void generateException(String str) {
        for (int i = 0; i <= str.length(); i++) {
            System.out.println(str.charAt(i));
        }
    }

    public void StringIndexOutOfBoundsException(String str) {
        try {
            for (int i = 0; i <= str.length(); i++) {
                System.out.println(str.charAt(i));
            }
        } catch (StringIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();

        P5 obj = new P5();
        // obj.generateException(str);
        obj.StringIndexOutOfBoundsException(str);

    }
}

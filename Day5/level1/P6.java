
import java.util.*;

public class P6 {

    public void generateException(String str) {
        String sub = str.substring(3, 1);
        System.out.println(sub);
    }

    public void IllegalArgumentException(String str) {
        try {
            String sub = str.substring(3, 1);
            System.out.println(sub);
        } catch (IllegalArgumentException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();

        P6 obj = new P6();
        // obj.generateException(str);
        obj.IllegalArgumentException(str);

    }
}

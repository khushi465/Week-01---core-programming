
import java.util.*;

public class P7 {

    public void generateException(String str) {
        int num = Integer.parseInt(str);
        System.out.println(num);
    }

    public void NumberFormatException(String str) {
        try {
            int num = Integer.parseInt(str);
            System.out.println(num);
        } catch (NumberFormatException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter string");
        String str = sc.next();

        P7 obj = new P7();
        // obj.generateException(str);
        obj.NumberFormatException(str);

    }
}

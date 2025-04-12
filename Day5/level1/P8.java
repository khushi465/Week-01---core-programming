import java.util.*;

public class P8 {

    public void generateException(String str[]) {
        for (int i = 0; i <= 3; i++) {
            System.out.println(str[i]);
        }
    }

    public void ArrayIndexOutOfBoundsException(String str[]) {
        try {
            for (int i = 0; i <= 3; i++) {
                System.out.println(str[i]);
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str[] = new String[3];
        System.out.println("Enter 3 strings");
        for (int i = 0; i < 3; i++) {
            str[i] = sc.next();
        }

        P8 obj = new P8();
        // obj.generateException(str);
        obj.ArrayIndexOutOfBoundsException(str);
    }
}
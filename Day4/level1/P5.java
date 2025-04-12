import java.util.*;
public class P5 {
    int check(int num) {
        if (num > 0) {
            return 1;
        } else if (num < 0) {
            return -1;
        } else {
            return 0;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        P5 obj = new P5();
        int res = obj.check(number);
        System.out.println(res);
    }
}


import java.util.*;

public class P7 {

    int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int number = sc.nextInt();
        P7 obj = new P7();
        int sum = obj.calculateSum(number);
        System.out.println(sum);
    }
}

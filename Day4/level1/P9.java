
import java.util.*;

public class P9 {

    public static int[] findQuotientAndRemainder(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        int arr[] = {quotient, remainder};
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and divisor");
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int res[] = P9.findQuotientAndRemainder(num1, num2);
        System.out.println("Quotient " + res[0] + " Remainder " + res[1]);
    }
}

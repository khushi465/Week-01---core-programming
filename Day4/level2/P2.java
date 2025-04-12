
import java.util.*;

public class P2 {

    public int calculateSumUsingFormula(int n) {
        int sum = n * (n + 1) / 2;
        return sum;
    }

    public int calculateSumUsingRecursion(int n) {
        if (n == 0) {
            return 0;
        }
        else{
            // System.out.println(n + calculateSumUsingFormula(n - 1));
        return n + calculateSumUsingRecursion(n - 1);
    }
}

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        if (num < 0) {
            System.out.println("Invalid Input");
            System.exit(0);
        }
        P2 obj = new P2();

        int sumFormula = obj.calculateSumUsingFormula(num);
        int sumRecursion = obj.calculateSumUsingRecursion(num);
        System.out.println("Sum using formula " + sumFormula);
        System.out.println("Sum using recursion " + sumRecursion);
    }
}


import java.util.*;

public class P1 {

    public static int[] findFactors(int num) {
        int count = 0;
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int factors[] = new int[count];
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                factors[index] = i;
                index++;
            }
        }
        return factors;
    }

    public int calculateSum(int[] f) {
        int sum = 0;
        for (int i = 0; i < f.length; i++) {
            sum += f[i];
        }
        return sum;
    }

    public int calculateProduct(int[] f) {
        int product = 1;
        for (int i = 0; i < f.length; i++) {
            product *= f[i];
        }
        return product;
    }

    public int calculateSumOfSquare(int[] f) {
        int sum = 1;
        for (int i = 0; i < f.length; i++) {
            sum += Math.pow(f[i], 2);
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int[] factors = P1.findFactors(num);
        P1 obj = new P1();

        int sum = obj.calculateSum(factors);
        int product = obj.calculateProduct(factors);
        int sumOfSquare = obj.calculateSumOfSquare(factors);
        System.out.println("Factors");
        for (int i = 0; i < factors.length; i++) {
            System.out.println(factors[i]);
        }
        System.out.println("Sum of factors " + sum);
        System.out.println("Product of factors " + product);
        System.out.println("Sum of Square of factors " + sumOfSquare);
    }
}

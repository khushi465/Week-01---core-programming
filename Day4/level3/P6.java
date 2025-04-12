
import java.util.*;

public class P6 {

    public static int[] findFactors(int num) {
        int count = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                count++;
            }
        }
        int fact[] = new int[count];
        int index = 0;
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                fact[index] = i;
                index++;
            }
        }
        return fact;
    }

    public static int findGreatest(int[] fact) {
        int largest = fact[0];
        for (int i = 0; i < fact.length - 1; i++) {
            if (fact[i] > largest) {
                largest = fact[i];
            }
        }
        return largest;
    }

    public static int findSum(int[] fact) {
        int sum = 0;
        for (int i = 0; i < fact.length; i++) {
            sum += fact[i];
        }
        return sum;
    }

    public static int findProduct(int[] fact) {
        int product = 1;
        for (int i = 0; i < fact.length; i++) {
            product *= fact[i];
        }
        return product;
    }

    public static double[] findCube(int[] fact) {
        double cube[] = new double[fact.length];
        for (int i = 0; i < fact.length; i++) {
            cube[i] = Math.pow(fact[i], 3);
        }
        return cube;
    }

    public static boolean isPerfect(int num) {
        if (num > 0) {
            int fact[] = findFactors(num);
            int sum = findSum(fact);
            if (sum == num) {
                return true;
            } else {
                return false;
            }
        }
        return false;
    }

    public static boolean isAbundant(int num) {
        int fact[] = findFactors(num);
        int sum = findSum(fact);
        if (sum > num) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isDeficient(int num) {
        int fact[] = findFactors(num);
        int sum = findSum(fact);
        if (sum < num) {
            return true;
        } else {
            return false;
        }
    }

    public static boolean isStrong(int num) {
        int sum = 0;
        // int dig;
        int temp = num;
        while (temp != 0) {
            int fact = 1;
            int dig = temp % 10;
            for (int i = 1; i < dig; i++) {
                fact *= i;
            }
            sum += fact;
            temp /= 10;
        }
        if (sum == num) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number");
        int num = sc.nextInt();
        int[] factors = P6.findFactors(num);
        for (int i = 0; i < factors.length; i++) {
            System.out.println(factors[i]);
        }
        int greatest = P6.findGreatest(factors);
        System.out.println("Greatest Factor: " + greatest);
        int sum = P6.findSum(factors);
        System.out.println("Sum of Factors: " + sum);
        int product = P6.findProduct(factors);
        System.out.println("Product of Factors: " + product);
        double cube[] = P6.findCube(factors);
        for (int i = 0; i < factors.length; i++) {
            System.out.println(cube[i]);
        }

        boolean Perfect = P6.isPerfect(num);
        System.out.println("Number is Perfect: " + Perfect);
        boolean Abundant = P6.isAbundant(num);
        System.out.println("Number is Abundant: " + Abundant);
        boolean Deficient = P6.isDeficient(num);
        System.out.println("Number is Deficient: " + Deficient);
        boolean Strong = P6.isStrong(num);
        System.out.println("Number is Strong: " + Strong);

        sc.close();
    }
}

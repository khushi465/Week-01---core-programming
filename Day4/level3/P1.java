
import java.util.*;

public class P1 {
    // Method To convert kilometers to miles and return the value

    public double calculateSum(double heights[]) {
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }
        return sum;
    }

    public double calculateMean(double heights[]) {
        double sum = 0;
        for (int i = 0; i < 11; i++) {
            sum += heights[i];
        }
        double mean = sum / 11;
        return mean;
    }

    public double calculateMin(double heights[]) {
        double min = heights[0];
        for (int i = 0; i < 11; i++) {
            if (min > heights[i]) {
                min = heights[i];
            }
        }
        return min;
    }

    public double calculateMax(double heights[]) {
        double max = heights[0];
        for (int i = 0; i < 11; i++) {
            if (max < heights[i]) {
                max = heights[i];
            }
        }
        return max;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take input for km
        double heights[] = new double[11];
        System.out.println("Enter heights of football players in cm");
        for (int i = 0; i < 11; i++) {
            heights[i] = sc.nextDouble();
            if (!(heights[i] >= 150 && heights[i] <= 250)) {
                System.out.println("Invalid height try again ");
                i--;
            }
        }
        P1 obj = new P1();
        double sum = obj.calculateSum(heights);
        double mean = obj.calculateMean(heights);
        double min = obj.calculateMin(heights);
        double max = obj.calculateMax(heights);
        System.out.println("Sum " + sum);
        System.out.println("Mean " + mean);
        System.out.println("Min " + min);
        System.out.println("Max " + max);

        // Close the Scanner object
        sc.close();
    }
}

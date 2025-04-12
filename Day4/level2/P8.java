
import java.util.*;

public class P8 {

    public int findYoungest(int age[]) {
        int youngest = age[0];
        for (int i = 0; i < 3; i++) {
            if (age[i] < youngest) {
                youngest = age[i];
            }
        }
        return youngest;
    }

    public double findTallest(double height[]) {
        double tallest = height[0];
        for (int i = 0; i < 3; i++) {
            if (height[i] > tallest) {
                tallest = height[i];
            }
        }
        return tallest;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ages and heights of Amar, Akbar and Anthony");
        int age[] = new int[3];
        double height[] = new double[3];
        for (int i = 0; i < 3; i++) {
            age[i] = sc.nextInt();
            height[i] = sc.nextDouble();
        }
        P8 obj = new P8();
        String name[] = {"Amar", "Akbar", "Anthony"};
        int youngest = obj.findYoungest(age);
        double tallest = obj.findTallest(height);
        System.out.println("Youngest " + youngest);
        System.out.println("Tallest " + tallest);
    }
}

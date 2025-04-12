
import java.util.*;

public class P11 {

    public double[] calculateRoots(int a, int b, int c) {
        double delta = Math.pow(b, 2) - 4 * a * c;
        double root1, root2;
        if (delta > 0) {
            root1 = (-b + Math.sqrt(delta)) / (2 * a);
            root2 = (-b - Math.sqrt(delta)) / (2 * a);
            double roots[] = {root1, root2};
            return roots;
        } else if (delta == 0) {
            root1 = (-b) / (2 * a);
            double roots[] = {root1};
            return roots;
        } else {
            double roots[] = {};
            return roots;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter values of a, b and c");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        P11 obj = new P11();
        double roots[] = obj.calculateRoots(a, b, c);
        if (roots.length > 0) {
            System.out.println("Roots: ");
            for (int i = 0; i < roots.length; i++) {
                System.out.println(roots[i]);
            }
        } else {
            System.out.println("No roots");
        }
    }
}

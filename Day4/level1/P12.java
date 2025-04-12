
import java.util.*;

public class P12 {

    public double[] calculateTrigonometricFunctions(double a) {
        double angleInRadian = Math.toRadians(a);
        double sin = Math.sin(angleInRadian);
        double cos = Math.cos(angleInRadian);
        double tan = Math.tan(angleInRadian);
        double arr[] = {sin, cos, tan};
        return arr;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter angle");
        double angle = sc.nextDouble();
        P12 obj = new P12();
        double res[] = obj.calculateTrigonometricFunctions(angle);
        System.out.println("Sine, Cosine and Tangent of " + angle);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i]);
        }
    }
}

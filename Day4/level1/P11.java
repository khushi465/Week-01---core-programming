
import java.util.*;

public class P11 {

    public double calculateWindChill(double temperature, double windSpeed) {
        double windChill = 35.74 + 0.6215 * temperature + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
        return windChill;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Temperature and Wind Speed");
        double temperature = sc.nextDouble();
        double windSpeed = sc.nextDouble();
        P11 obj = new P11();
        double windChill = obj.calculateWindChill(temperature, windSpeed);
        System.out.println(windChill);
    }
}

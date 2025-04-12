
import java.util.*;

public class P4 {
    double calculateRounds(double s1, double s2, double s3){
        int distance=5000;
        double perimeter=s1+s2+s3;
        double r = distance / perimeter;
        return r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter sides of triangular park in meters");
        double side1 = sc.nextDouble();
        double side2 = sc.nextDouble();
        double side3 = sc.nextDouble();
        P4 obj = new P4();
        double rounds = obj.calculateRounds(side1,side2,side3);

        System.out.println("The total number of rounds the athlete will run is " + rounds + "rounds to complete 5 km");
    }
}

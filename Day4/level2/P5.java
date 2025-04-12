import java.util.*;
public class P5 {
    // Method To convert kilometers to miles and return the value
    public static double convertYardsToFeet(double yards) {
        // Convert km to miles
        double yards2Feet = 3;
        double feet = yards * yards2Feet;
        // return the value
        return feet;
    }
    public static double convertFeetToYards(double feet) {
        double feet2Yards = 0.333333;
        double yards = feet * feet2Yards;
        // return the value
        return yards;
    }
    public static double convertMetersToInches(double meters) {
        double meters2inches = 39.3701;
        double inches = meters * meters2inches;
        // return the value
        return inches;
    }
    public static double convertInchesToMeters(double inches) {
        double inches2meters = 0.0254;
        double meters = inches * inches2meters;
        // return the value
        return meters;
    }
    public static double convertInchesToCm(double inches) {
        double inches2cm = 2.54;
        double cm = inches * inches2cm;
        // return the value
        return cm;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km
        System.out.print("Enter the distance in yards: ");
        double yards = sc.nextDouble();
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();
        System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();
        System.out.print("Enter the distance in inches: ");
        double inches = sc.nextDouble();
        
        double feet1 = P5.convertYardsToFeet(yards); 
        double yards1 = P5.convertFeetToYards(feet); 
        double inches1 = P5.convertMetersToInches(meters); 
        double meters1 = P5.convertInchesToMeters(inches); 
        double cm1 = P5.convertInchesToCm(inches); 

        System.out.println("Distance in yards to feet: " + feet1);
        System.out.println("Distance in feet to yards: " + yards1);
        System.out.println("Distance in meters to inches " + inches1);
        System.out.println("Distance in inches to meters: " + meters1);
        System.out.println("Distance in inches to cm: " + cm1);

        // Close the Scanner object
        sc.close();
    }
}

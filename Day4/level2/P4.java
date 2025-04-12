import java.util.*;
public class P4 {
    // Method To convert kilometers to miles and return the value
    public static double convertKmToMiles(double km) {
        // Convert km to miles
        double km2miles = 0.621371;
        double miles = km * km2miles;
        // return the value
        return miles;
    }
    public static double convertMilesToKm(double miles) {
        double miles2km = 1.60934;
        double km = miles * miles2km;
        // return the value
        return km;
    }
    public static double convertMetersToFeet(double meters) {
        double meters2feet = 3.28084;
        double feet = meters * meters2feet;
        // return the value
        return feet;
    }
    public static double convertFeetToMeters(double feet) {
        double feet2meters = 0.3048;
        double meters = feet * feet2meters;
        // return the value
        return meters;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);

        // Take input for km
        System.out.print("Enter the distance in kilometers: ");
        double km = sc.nextDouble();
        System.out.print("Enter the distance in miles: ");
        double miles = sc.nextDouble();
        System.out.print("Enter the distance in meters: ");
        double meters = sc.nextDouble();
        System.out.print("Enter the distance in feet: ");
        double feet = sc.nextDouble();

        // Call the method to convert km to miles
        double miles1 = P4.convertKmToMiles(km); 
        double km1 = P4.convertMilesToKm(miles); 
        double feet1 = P4.convertMetersToFeet(meters); 
        double meters1 = P4.convertFeetToMeters(feet); 

        System.out.println("Distance in km to miles: " + miles1);
        System.out.println("Distance in miles to km: " + km1);
        System.out.println("Distance in meters to feet: " + feet1);
        System.out.println("Distance in feet to meters: " + meters1);

        // Close the Scanner object
        sc.close();
    }
}

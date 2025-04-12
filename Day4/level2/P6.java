import java.util.*;
public class P6 {
    // Method To convert kilometers to miles and return the value
    public static double convertFarhenheitToCelsius(double farhenheit) {
        // Convert km to miles
        double farhenheit2celsius = (farhenheit - 32) * 5 / 9;
        // return the value
        return farhenheit2celsius;
    }
    public static double convertCelsiusToFarhenheit(double celsius) {
        double celsius2Farhenheit = (celsius * 9 / 5) + 32;
        // return the value
        return celsius2Farhenheit;
    }
    public static double convertPoundsTokg(double pounds) {
        double pounds2kg = 0.453592;
        double kg = pounds * pounds2kg;
        // return the value
        return kg;
    }
    public static double convertKgToPounds(double kg) {
        double kg2pounds = 2.20462;
        double pounds = kg * kg2pounds;
        // return the value
        return pounds;
    }
    public static double convertGallonsToLitres(double gallons) {
        double gallons2litres = 3.78541;
        double litres = gallons * gallons2litres;
        // return the value
        return litres;
    }
    public static double convertLitresToGallons(double litres) {
        double litres2gallons = 0.264172;
        double gallons = litres * litres2gallons;
        // return the value
        return gallons;
    }

    public static void main(String[] args) {
        // Create a Scanner object
        Scanner sc = new Scanner(System.in);
        // Take input for km
        System.out.print("Enter the Temperature in farhenheit: ");
        double farhenheit = sc.nextDouble();
        System.out.print("Enter the Temperature in celsius: ");
        double celsius = sc.nextDouble();
        System.out.print("Enter the Weight in pounds: ");
        double pounds = sc.nextDouble();
        System.out.print("Enter the Weight in kg: ");
        double kg = sc.nextDouble();
        System.out.print("Enter the Volume in gallons: ");
        double gallons = sc.nextDouble();
        System.out.print("Enter the Volume in litres: ");
        double litres = sc.nextDouble();
       
        double celsius1 = P6.convertFarhenheitToCelsius(farhenheit);
        double farhenheit1 = P6.convertCelsiusToFarhenheit(celsius);
        double kg1 = P6.convertPoundsTokg(pounds);
        double pounds1 = P6.convertKgToPounds(kg);
        double litres1 = P6.convertGallonsToLitres(gallons);
        double gallons1 = P6.convertLitresToGallons(litres);


        System.out.println("Temperature in farhenheit to celsius: " + celsius1);
        System.out.println("Temperature in celsius to farhenheit: " + farhenheit1);
        System.out.println("Weight in pounds to kg " + kg1);
        System.out.println("Weight in kg to pounds: " + pounds1);
        System.out.println("Volume in gallons to litres " + litres1);
        System.out.println("Volume in litres to gallons: " + gallons1);

        // Close the Scanner object
        sc.close();
    }
}
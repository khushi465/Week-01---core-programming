import java.util.*;
public class P14{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter distance in feet");
	double distanceInFeet=sc.nextDouble();

	double distanceInYard=distanceInFeet/3;
	double distanceInMile=distanceInYard/1760;

	System.out.println("The distance in yards is "+distanceInYard+" while the distance in miles is "+distanceInMile);
	}
}

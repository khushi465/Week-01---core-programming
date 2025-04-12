import java.util.*;
public class P12{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter base and height of triangle in cm");
	int baseInCm=sc.nextInt();
	int heightInCm=sc.nextInt();

	double baseInInch=baseInCm/2.54;
	double heightInInch=heightInCm/2.54;
	double areaInCm=(double)1/2*baseInCm*heightInCm;
	double areaInInch=(double)1/2*baseInInch*heightInInch;

	System.out.println("The Area of the triangle in sq in is "+areaInInch+" and sq cm is "+areaInCm);
	}
}

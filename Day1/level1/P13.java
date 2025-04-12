import java.util.*;
public class P13{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter Perimeter of square");
	int perimeter=sc.nextInt();

	double side=(double)perimeter/4;

	System.out.println("The length of the side is "+side+" whose perimeter is "+perimeter);
	}
}

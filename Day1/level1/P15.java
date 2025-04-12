import java.util.*;
public class P15{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter unit price and quantity");
	double unitPrice=sc.nextInt();
	int quantity=sc.nextInt();

	double totalPrice=unitPrice*quantity;

	System.out.println("The total purchase price is INR "+totalPrice+" if the quantity "+quantity+" and unit price is INR "+unitPrice);
	}
}

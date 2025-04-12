import java.util.*;
public class P1{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter 2 numbers");
	int number1=sc.nextInt();
	int number2=sc.nextInt();

	int quotient=number1/number2;
	int remainder=number1%number2;

	System.out.println("The Quotient is "+quotient+" and remainder is "+remainder+" of two number "+number1+" and "+number2);
	}
}

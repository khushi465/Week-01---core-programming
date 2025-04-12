import java.util.*;
public class P3{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a,b and c");
	double a=sc.nextDouble();
	double b=sc.nextDouble();
	double c=sc.nextDouble();

	double res1=a+b*c;
	double res2=a*b+c;
	double res3=c+a/b;
	double res4=a%b+c;

	System.out.println("The results of Double Operations are a+b*c="+res1+", a*b+c="+res2+", c+a/b="+res3+" and a%b+c="+res4);
	}
}

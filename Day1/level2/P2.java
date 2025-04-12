import java.util.*;
public class P2{
	public static void main(String[] args){
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a,b and c");
	int a=sc.nextInt();
	int b=sc.nextInt();
	int c=sc.nextInt();

	int res1=a+b*c;
	int res2=a*b+c;
	int res3=c+a/b;
	int res4=a%b+c;

	System.out.println("The results of Int Operations are a+b*c="+res1+", a*b+c="+res2+", c+a/b="+res3+" and a%b+c="+res4);
	}
}

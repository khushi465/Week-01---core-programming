import java.util.*;
public class P11{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double sum=0.0;
System.out.println("Enter value");
double val=sc.nextDouble();

while(true){
sum=sum+val;
System.out.println("Enter value");
val=sc.nextDouble();
if(val<=0){
	break;
}
}
System.out.println("Sum: "+sum);
}}
import java.util.*;
public class P11{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter principle, rate and time(in years)");
double principle=sc.nextDouble();
double rate=sc.nextDouble();
double time=sc.nextDouble();

double simpleInterest=(p*t*r)/100;

System.out.println("The Simple Interest is "+simpleInterest+" for Principle "+principle+", Rate "+rate+" and Time "+time);
}}
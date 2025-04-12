import java.util.*;
public class P6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter salary and bonus");
double salary=sc.nextDouble();
double bonus=sc.nextDouble();

double income=salary+bonus;

System.out.println("The Salary is INR "+salary+" and bonus is INR "+bonus+". Hence Total Income is INR "+income);
}}
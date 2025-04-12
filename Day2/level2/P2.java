import java.util.*;
public class P2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter salary and year of service");
double salary=sc.nextDouble();
int bonus=0;
int yearOfService=sc.nextInt();
if(yearOfService>5){
bonus=5;
}
double bonusAmount=(double)bonus/100*salary;
System.out.println("Bonus amount is "+bonusAmount);
}}
import java.util.*;
public class P8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter height in cm");
double heightInCm=sc.nextDouble();

double heightInInch=heightInCm/2.54;
double heightInFeet=heightInInch/12;

System.out.println("Your height in cm is "+heightInCm+" while in feet is "+heightInFeet+" and inches is "+heightInInch);
}}

import java.util.*;
public class P4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter temperature in celsius");
double cel=sc.nextDouble();

double far=cel*(double)9/5+32;

System.out.println("The "+cel+" Celsius is "+far+" Farhenheit");
}}
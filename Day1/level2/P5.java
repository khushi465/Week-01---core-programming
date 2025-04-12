import java.util.*;
public class P5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter temperature in farhenheit");
double far=sc.nextDouble();

double cel=(far-32)*(double)5/9;

System.out.println("The "+far+" Farhenheit is "+cel+" Celsius");
}}
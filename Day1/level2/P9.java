import java.util.*;
public class P9{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter sides of triangular park in meters");
int side1=sc.nextInt();
int side2=sc.nextInt();
int side3=sc.nextInt();
int distance=5000;

int perimeter=side1+side2+side3;
double rounds=(double)distance/perimeter;

System.out.println("The total number of rounds the athlete will run is "+rounds+" to complete 5 km");
}}
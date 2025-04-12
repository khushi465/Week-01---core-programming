import java.util.*;
public class P10{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double total=0.0;
System.out.println("Enter value");
double val=sc.nextDouble();

while(val!=0){
total=total+val;
System.out.println("Enter value");
val=sc.nextDouble();
}
System.out.println("Total: "+total);
}}
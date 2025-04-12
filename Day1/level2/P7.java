import java.util.*;
public class P7{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter 2 numbers to swap");
int num1=sc.nextInt();
int num2=sc.nextInt();
System.out.println("Original numbers num1="+num1+", num2="+num2);
int temp=num1;
num1=num2;
num2=temp;
System.out.println("Swapped numbers num1="+num1+", num2="+num2);
}}
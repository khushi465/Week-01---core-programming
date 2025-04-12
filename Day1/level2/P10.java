import java.util.*;
public class P10{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number of chocolates and number of children");
int numberOfChocolates=sc.nextInt();
int numberOfChildren=sc.nextInt();
int chocolatePerChild=numberOfChocolates/numberOfChildren;
int remainingChocolates=numberOfChocolates%numberOfChildren;

System.out.println("The number of chocolates each child gets is "+chocolatePerChild+" and the number of remaining chocolates are "+remainingChocolates);
}}
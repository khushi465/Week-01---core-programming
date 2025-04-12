import java.util.*;
public class P12{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
int sumFormula=0,sumLoop=0;
if(num>0){
sumFormula=num*(num+1)/2;
int i=0;
while(i<=num){
sumLoop+=i;
i++;
}
System.out.println("Sum by formula is "+sumFormula);
System.out.println("Sum by loop is "+sumLoop);
}}}
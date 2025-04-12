import java.util.*;
public class P14{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
int fact=1;
if(num>0){
int i=1;
while(i<=num){
fact*=i;
i++;
}
System.out.println("Factorial: "+fact);
}}
}
import java.util.*;
public class P8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
if(num>0){
int i=1;
while(i<=num){
if(num%i==0){
System.out.println(i);
}
i++;
}}
}}
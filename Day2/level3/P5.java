import java.util.*;
public class P5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
int sum=0;
int temp=num;

while(temp!=0){
sum+=Math.pow(temp%10,3);
temp/=10;
}
if(num==sum){
System.out.println("Armstrong Number");
}
else{
System.out.println("Not an Armstrong Number");
}
}}
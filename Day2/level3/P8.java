import java.util.*;
public class P8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
int sum=0;
int temp=num;

while(temp!=0){
sum+=temp%10;
temp/=10;
}
if(num%sum==0){
System.out.println("Harshad Number");
}
else{
System.out.println("Not a Harshad Number");
}
}}
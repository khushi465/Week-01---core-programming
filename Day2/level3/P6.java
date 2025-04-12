import java.util.*;
public class P6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
int count=0;
int temp=num;

while(temp!=0){
count+=1;
temp/=10;
}
System.out.println(count);
}}
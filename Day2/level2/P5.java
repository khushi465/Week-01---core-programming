import java.util.*;
public class P5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
if(num>0){
int i=1;
while(i<=num){
if(i%3==0&&i%5==0){
	System.out.println("FizzBuzz");
	}
	else if(i%5==0){
		System.out.println("Buzz");
	}
	else if(i%3==0){
		System.out.println("Fizz");}
	else{
		System.out.println(i);
}
i++;
}
}
}}
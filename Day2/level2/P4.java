import java.util.*;
public class P4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
if(num>0){
	for(int i=1;i<=num;i++){
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
}
}
}}
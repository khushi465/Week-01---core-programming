import java.util.*;
public class P4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
int sum=0;
boolean isPrime=true;

for(int i=2;i<num;i++){
	if(num%i==0){
		isPrime=false;
		break;
	}
}

if(isPrime){
System.out.println("Prime Number");
}
else{
System.out.println("Not a Prime Number");
}
}}
import java.util.*;
public class P10{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
if(num>0){
String arr[]=new String[num];
for(int i=0;i<num;i++){
	if(i%3==0&&i%5==0){
		arr[i]="FizzBuzz";
	}else if(i%3==0){
		arr[i]="Fizz";
	}
	else if(i%5==0){
		arr[i]="Buzz";
	}
	else{
		arr[i]=Integer.toString(i);
	}
}

System.out.println("Array");
for(int i=0;i<num;i++){
	System.out.println(arr[i]+" ");
}
}
}}
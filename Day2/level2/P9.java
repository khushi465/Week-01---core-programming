import java.util.*;
public class P9{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
int greatestFactor=1;
if(num>0){
for(int i=num-1;i>=1;i--){
if(num%i==0){
	greatestFactor=i;
break;
}
}
System.out.println(greatestFactor);
}
}}
import java.util.*;
public class P1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter year");
int year=sc.nextInt();
boolean leap=false;
if(year>=1582){
if(year%400==0){
	leap=true;
}else if (year%4==0){
	if(year%100!=0){
		leap=true;
}}
else{
	leap=false;
}
if(leap){
	System.out.println("Leap Year");
}
else{
System.out.println("Not a Leap Year");
}
}
}}
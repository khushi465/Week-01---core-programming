import java.util.*;
public class P13{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
if(num>0){
	int i=num;
	while(i<=100){
		if(i%num==0){
			System.out.println(i);
		}
	i++;
	}
}
}}
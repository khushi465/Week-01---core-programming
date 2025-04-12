import java.util.*;
public class P14{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number and power");
int num=sc.nextInt();
int pow=sc.nextInt();
int res=1;
if(num>0){
	int i=1;
	while(i<=pow){
		res*=num;
		i++;
	}
System.out.println(res);
}
}}

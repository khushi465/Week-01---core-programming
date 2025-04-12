import java.util.*;
public class P12{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number and power");
int num=sc.nextInt();
int pow=sc.nextInt();
int res=1;
if(num>0){
for(int i=1;i<=pow;i++){
res*=num;
}
System.out.println(res);
}
}}
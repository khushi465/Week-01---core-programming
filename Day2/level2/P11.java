import java.util.*;
public class P11{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
if(num>0){
for(int i=num;i<=100;i++){
if(i%num==0){
System.out.println(i);
}
}
}
}}
import java.util.*;
public class P3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number from 6 to 9");
int num=sc.nextInt();
if(num>=6&&num<=9){
for(int i=1;i<=10;i++){
System.out.println(num+"x"+i+"="+(num*i));
}
}
}}
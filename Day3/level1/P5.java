import java.util.*;
public class P5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int multiplicationResult[]=new int[10];
System.out.println("Enter number from 6 to 9");
int num=sc.nextInt();
if(num>=6&&num<=9){
for(int i=0;i<multiplicationResult.length;i++){
multiplicationResult[i]=num*(i+1);
}
for(int i=0;i<multiplicationResult.length;i++){
System.out.println(num+"*"+(i+1)+"="+multiplicationResult[i]);
}
}
else{
	System.out.println("Invalid input");
}
}}

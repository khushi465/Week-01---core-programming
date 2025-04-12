import java.util.*;
public class P3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int multiples[]=new int[10];
System.out.println("Enter number");
int num=sc.nextInt();
for(int i=0;i<multiples.length;i++){
multiples[i]=num*(i+1);
}
for(int i=0;i<multiples.length;i++){
System.out.println(num+"*"+(i+1)+"="+multiples[i]);
}
}}

import java.util.*;
public class P1{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();

System.out.println("Is the number "+num+" divisible by 5? "+(num%5==0));
}
}
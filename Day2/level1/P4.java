import java.util.*;
public class P4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();

if(num>0){
int sum=num*(num+1)/2;
System.out.println("The sum of "+num+" natural numbers is "+sum);
}
else{
System.out.println("The number "+num+" is not a natural number");
}
}
}
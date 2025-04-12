import java.util.*;
public class P6{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter age of Amar,Akbar and Anthony");
int age1=sc.nextInt();
int age2=sc.nextInt();
int age3=sc.nextInt();
System.out.println("Enter height of the 3 boys");
int height1=sc.nextInt();
int height2=sc.nextInt();
int height3=sc.nextInt();

if(age1<age2&&age1<age3){
System.out.println("Smallest age is Amar "+age1);
}
else if(age2<age1&&age2<age3){
System.out.println("Smallest age is Akbar "+age2);
}
else{
System.out.println("Smallest age is Anthony "+age3);
}

if(height1>height2&&height1>height3){
System.out.println("Largest height is Amar "+height1);
}
else if(height2<height1&&height2<height3){
System.out.println("Largest height is Akbar "+height2);
}
else{
System.out.println("Largest height is Anthony "+height3);
}
}}
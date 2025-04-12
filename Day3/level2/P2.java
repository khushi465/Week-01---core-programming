import java.util.*;
public class P2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter height and age of Amar, Akbar and Anthony");
double height[]=new double[3];
int age[]=new int[3];
for(int i=0;i<3;i++){
	height[i]=sc.nextDouble();
	age[i]=sc.nextInt();
}
double tallest=height[0];
int tallI=0, youngI=0;
int youngest=age[0];
for(int i=0;i<3;i++){
	if(height[i]>tallest){
		tallest=height[i];
		tallI=i;
	}
	if(age[i]<youngest){
		youngest=age[i];
		youngI=i;
	}
}
String name[]={"Amar","Akbar","Anthony"};
System.out.println("Tallest is "+name[tallI]+" at height "+tallest);
System.out.println("Youngest is "+name[youngI]+" at age "+youngest);
}}
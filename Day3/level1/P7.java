import java.util.*;
public class P7{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
if(num<0){
System.out.println("Invalid Input");
System.exit(0);
}
int even[]=new int[num/2+1];
int odd[]=new int[num/2+1];
int evenI=0, oddI=0;
for(int i=1;i<=num;i++){
	if(i%2==0){
		even[evenI]=i;
		evenI++;
	}
	else{
		odd[oddI]=i;
		oddI++;
}}
System.out.println("Even Array");
for(int i=0;i<evenI;i++){
System.out.println(even[i]);
}
System.out.println("Odd Array");
for(int i=0;i<oddI;i++){
System.out.println(odd[i]);
}
}
}

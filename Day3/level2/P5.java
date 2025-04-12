import java.util.*;
public class P5{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
int count=0;
int temp=num;
while(temp!=0){
	temp/=10;
	count++;
}
int i=count-1;
int numArr[]=new int[count];
int revArr[]=new int[count];
temp=num;
while(temp!=0){
	numArr[i]=temp%10;
	temp/=10;
	i--;
}

for(int j=0;j<count;j++){
	revArr[j]=numArr[count-j-1];
}
for(int j=0;j<count;j++){
	System.out.println(revArr[j]);
}
}}
import java.util.*;
public class P3{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
long num=sc.nextLong();
int count=0;
long temp=num;
int numArr[]=new int[10];
while(temp!=0){
	numArr[count]=(int)temp%10;
	temp/=10;
	count++;
	if(count==10){
		break;
	}
}
int largest=0;
int secondLargest=0;
for(int i=0;i<count;i++){
	if(numArr[i]>largest){
		secondLargest=largest;
		largest=numArr[i];
}else if(numArr[i]>secondLargest&&numArr[i]!=largest){
	secondLargest=numArr[i];
}
}
System.out.println("Largest is "+largest+"\nSecond Largest is "+secondLargest);
}}
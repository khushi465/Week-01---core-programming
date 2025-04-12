import java.util.*;
public class P4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
long num=sc.nextLong();
int count=0;
long num1=num;
int maxDigit=10;
int numArr[]=new int[maxDigit];
while(num1!=0){
	numArr[count]=(int)num1%10;
	num1/=10;
	count++;
	if(count==maxDigit){
	maxDigit+=10;
	int temp[]=new int[maxDigit];
	for(int i=0;i<count;i++){
	temp[i]=numArr[i];
	}
	numArr=temp;
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
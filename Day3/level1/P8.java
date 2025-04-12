import java.util.*;
public class P8{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter number");
int num=sc.nextInt();
int maxFactor=10;
int factors[]=new int[maxFactor];
int temp[];
int index=0;
for(int i=1;i<=num;i++){
	if(num%i==0){
		factors[index]=i;
		index++;
	}
	if(index==maxFactor-1){
		maxFactor*=2;
		temp=new int[maxFactor];
		for(int j=0;j<index;j++){
			temp[j]=factors[j];
		}
		factors=temp;	
	}
	}
System.out.println("Factors");
for(int i=0;i<maxFactor;i++){
	if(factors[i]==0){
		break;
	}
System.out.println(factors[i]);
}
}
}

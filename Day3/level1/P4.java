import java.util.*;
public class P4{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
double num[]=new double[10];
System.out.println("Enter numbers");
double total=0.0;
int i=0;
while(true){
num[i]=sc.nextDouble();
if(num[i]<=0){
break;
}
i++;
if(i>=10){
	break;
}
}

for(i=0;i<num.length;i++){
	if(num[i]<=0){
		break;
	}
System.out.println(num[i]);
total+=num[i];
}
System.out.println("Total: "+total);
}}

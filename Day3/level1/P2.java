import java.util.*;
public class P2{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
int num[]=new int[5];
System.out.println("Enter 5 numbers");
for(int i=0;i<num.length;i++){
num[i]=sc.nextInt();
}
for(int i=0;i<num.length;i++){
if(num[i]<0){
System.out.println("Negative "+num[i]);
}
else if(num[i]>0){
if(num[i]%2==0){
System.out.println("Positive Even "+num[i]);
}
else{
System.out.println("Positive Odd "+num[i]);
}
}
else{
System.out.println("Zero "+num[i]);
}
}

if(num[0]>num[num.length-1]){
System.out.println(num[0]+ " is greater than "+num[num.length-1]);
}
else if(num[0]<num[num.length-1]){
System.out.println(num[0]+ " is less than "+num[num.length-1]);
}
else{
System.out.println(num[0]+ " is equal to "+num[num.length-1]);
}
}}
